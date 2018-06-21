package jianqiang.com.plugin1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jianqiang.mypluginlibrary.BaseFragment;

public class Fragment1 extends BaseFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment1, container, false);

		view.findViewById(R.id.load_fragment2_btn).setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Fragment2 fragment2 = new Fragment2();
				Bundle args = new Bundle();
				args.putString("username", "baobao");
				fragment2.setArguments(args);

				getFragmentManager()
						.beginTransaction()
						.addToBackStack(null)  //将当前fragment加入到返回栈中
						.replace(Fragment1.this.getContainerId(), fragment2).commit();
			}
		});

		view.findViewById(R.id.loadHostFragment).setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

//				Fragment2 fragment2 = new Fragment2();
//				Bundle args = new Bundle();
//				args.putString("username", "baobao");
//				fragment2.setArguments(args);
//
//				getFragmentManager()
//						.beginTransaction()
//						.addToBackStack(null)  //将当前fragment加入到返回栈中
//						.replace(Fragment1.this.getContainerId(), fragment2).commit();
			}
		});

		view.findViewById(R.id.loadPlugin2Fragment).setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

//				Fragment2 fragment2 = new Fragment2();
//				Bundle args = new Bundle();
//				args.putString("username", "baobao");
//				fragment2.setArguments(args);
//
//				getFragmentManager()
//						.beginTransaction()
//						.addToBackStack(null)  //将当前fragment加入到返回栈中
//						.replace(Fragment1.this.getContainerId(), fragment2).commit();
			}
		});

		return view;
	}
}

