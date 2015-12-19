package com.redrock.msi.thirdwork_android;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MSI on 2015/12/19.
 */
public class AnotherRightFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater ,ViewGroup container,Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.another_right_fragment,container,false);
        return view;
    }
}
