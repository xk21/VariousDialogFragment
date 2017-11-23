package com.jjyh.it.variousdialogfragment.fragment;

import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;

import com.jjyh.it.variousdialogfragment.R;
import com.jjyh.it.variousdialogfragment.utils.GeekUtils;

import org.json.JSONObject;


public class ShortcutMenuDialog extends DialogFragment implements View.OnClickListener {
    
    private RadioButton mRB1;
    private RadioButton mRB2;
    private RadioButton mRB3;
    private JSONObject mJsonObject;
    private int a = 0;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_AppCompat_Light_Dialog);
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.x = GeekUtils.dip2px(getContext(), 6);
        layoutParams.y = GeekUtils.dip2px(getContext(), 60);
        window.setDimAmount(0f);
        window.setGravity(Gravity.RIGHT | Gravity.BOTTOM);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //layoutParams.verticalMargin = GeekUtils.dip2px(getContext(), 500);
        return inflater.inflate(R.layout.mo_shortcut_menu_dialog, container, false);
    }
    
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mRB1 = (RadioButton) view.findViewById(R.id.shortcut_rb1);
        mRB2 = (RadioButton) view.findViewById(R.id.shortcut_rb2);
        mRB3 = (RadioButton) view.findViewById(R.id.shortcut_rb3);

        mRB1.setOnClickListener(this);
        mRB2.setOnClickListener(this);
        mRB3.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //形象选择
            case R.id.shortcut_rb1:
                
                dismiss();
                break;
            //智能场景
            case R.id.shortcut_rb2:
                dismiss();
                break;
            //帮助
            case R.id.shortcut_rb3:
                dismiss();
                break;
            default:
                break;
        }
    }
    
    public void isShowScene() {
        if (a == 1) {
            
            Drawable drawable = getResources().getDrawable(R.drawable.mo_geek_wify_have,
                    getContext().getTheme());
            drawable.setBounds(0, 0, GeekUtils.dip2px(getContext(), 24),
                    GeekUtils.dip2px(getContext(), 24));
            mRB2.setCompoundDrawables(drawable, null, null, null);
            a = 0;

        } else {
            
            Drawable drawable = getResources().getDrawable(R.drawable.mo_geek_wify_no,
                    getContext().getTheme());
            drawable.setBounds(0, 0, GeekUtils.dip2px(getContext(), 24), GeekUtils.dip2px(getContext(), 24));
            mRB2.setCompoundDrawables(drawable, null, null, null);
            a = 1;
        }
    }
}
