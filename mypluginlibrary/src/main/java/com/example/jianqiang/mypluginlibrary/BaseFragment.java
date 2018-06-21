package com.example.jianqiang.mypluginlibrary;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BaseFragment extends Fragment {
	private int containerId;

	public int getContainerId() {
		return containerId;
	}

	public void setContainerId(int containerId) {
		this.containerId = containerId;
	}
}

