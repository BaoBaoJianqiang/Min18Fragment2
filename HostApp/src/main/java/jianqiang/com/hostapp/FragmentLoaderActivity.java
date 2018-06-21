package jianqiang.com.hostapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toast;

import com.example.jianqiang.mypluginlibrary.AppConstants;
import com.example.jianqiang.mypluginlibrary.BaseFragment;

import java.lang.reflect.Constructor;

public class FragmentLoaderActivity extends BaseHostActivity {

    private String mClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDexPath = getIntent().getStringExtra(AppConstants.EXTRA_DEX_PATH);
        mClass = getIntent().getStringExtra(AppConstants.EXTRA_CLASS);


        setContentView(R.layout.activity_fragment_loader);

        loadClassLoader();
        loadResources();

        try {
            //反射出插件的Fragment对象
            Class<?> localClass = dexClassLoader.loadClass(mClass);
            Constructor<?> localConstructor = localClass.getConstructor(new Class[] {});
            Object instance = localConstructor.newInstance(new Object[] {});
            BaseFragment f = (BaseFragment) instance;
            f.setContainerId(R.id.container);

            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.container, f);
            ft.commit();
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
