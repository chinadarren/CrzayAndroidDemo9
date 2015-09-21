package com.example.cl.crzayandroiddemo9;

import android.app.Activity;

import android.os.Bundle;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends Activity {

    ToggleButton toggle;
    Switch switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.togglebutton);
          toggle = (ToggleButton) findViewById(R.id.toggle);
          switcher = (Switch) findViewById(R.id.switcher);
         final LinearLayout ab = (LinearLayout) findViewById(R.id.abc);
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //设置LinearLayout 垂直布局
                    ab.setOrientation(LinearLayout.VERTICAL);
                }else {
                    //设置LinearLayout 水平布局
                   ab.setOrientation(LinearLayout.HORIZONTAL);
                }
            }
        };
        toggle.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);
    }
}
