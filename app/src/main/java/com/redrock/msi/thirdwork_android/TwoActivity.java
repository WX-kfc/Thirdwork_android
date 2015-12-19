package com.redrock.msi.thirdwork_android;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by MSI on 2015/12/19.
 */
public class TwoActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_two);
        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                AnotherRightFragment fragment=new AnotherRightFragment();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction transaction=fragmentManager.beginTransaction();
                transaction.replace(R.id.right_layout, fragment);
                transaction.commit();
                break;
            default:
                break;
        }
    }
}
