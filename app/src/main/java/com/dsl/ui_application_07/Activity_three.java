package com.dsl.ui_application_07;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * 功能：安卓控件之单项选择按钮自定义样式
 *
 * 作者：单胜凌
 * 时间：2016.12.14
 */
public class Activity_three extends Activity {

    RadioGroup mRG3;         //用于显示答案
    RadioButton mRB31;       //用于显示选项
    RadioButton mRB32;
    RadioButton mRB33;
    RadioButton mRB34;

    Button mBT3;             //跳转按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three); //加载布局文件
        //加载控件绑定
        mRG3 = (RadioGroup)findViewById(R.id.radiogroup3);
        mRB31= (RadioButton)findViewById(R.id.radiobutton31);
        mRB32= (RadioButton)findViewById(R.id.radiobutton32);
        mRB33= (RadioButton)findViewById(R.id.radiobutton33);
        mRB34= (RadioButton)findViewById(R.id.radiobutton34);
        mBT3 = (Button)findViewById(R.id.button33);
        //设置监听器
        mRG3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mRB33.getId()) {
                    MyToast("正确答案："+mRB33.getText()+"，恭喜你，回答正确");
                } else {
                    MyToast("回答错误！");
                }
            }
        });
        mBT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到下一项测试页
                finish();
            }
        });

    }

    private void MyToast(String str)
    {
        Toast mtoast = Toast.makeText(Activity_three.this,str,Toast.LENGTH_SHORT);
        mtoast.setGravity(Gravity.TOP,0,400);
        mtoast.show();
    }
}
