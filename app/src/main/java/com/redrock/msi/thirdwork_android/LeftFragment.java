package com.redrock.msi.thirdwork_android;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MSI on 2015/12/19.
 */
public class LeftFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view=inflater.inflate(R.id.left_fragment,container,false);
        return view;
    }
}
