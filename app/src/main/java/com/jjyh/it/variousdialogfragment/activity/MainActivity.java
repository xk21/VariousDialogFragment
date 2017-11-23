package com.jjyh.it.variousdialogfragment.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jjyh.it.variousdialogfragment.R;
import com.jjyh.it.variousdialogfragment.fragment.ShortcutMenuDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBt_1;
    private Button mBt_2;
    private Button mBt_3;
    private Button mBt_4;
    private ShortcutMenuDialog mMenuDialog;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    
    private void initView() {
        mBt_1 = findViewById(R.id.bt_1);
        mBt_2 = findViewById(R.id.bt_2);
        mBt_3 = findViewById(R.id.bt_3);
        mBt_4 = findViewById(R.id.bt_4);
        
        mBt_1.setOnClickListener(this);
        mBt_2.setOnClickListener(this);
        mBt_3.setOnClickListener(this);
        mBt_4.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_1:
                Toast.makeText(this, "创建了",Toast.LENGTH_SHORT).show();
                if (mMenuDialog ==null) {
                    mMenuDialog = new ShortcutMenuDialog();
                }
                if (!mMenuDialog.isAdded()) {
                    mMenuDialog.show(getFragmentManager(), null);
                }
                break;
            case R.id.bt_2:
            
                break;
            case R.id.bt_3:
                break;
            case R.id.bt_4:
                break;
        }
    }
}
