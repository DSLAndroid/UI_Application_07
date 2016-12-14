package com.dsl.ui_application_07;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 功能：安卓控件之单项选择按钮
 *
 * 作者：单胜凌
 * 时间：2016.12.14
 */
public class MainActivity extends Activity {

    TextView mTV;           //用于显示问题
    RadioGroup mRG;         //用于显示答案
    RadioButton mRB1;       //用于显示选项
    RadioButton mRB2;
    RadioButton mRB3;
    RadioButton mRB4;

    Button mBT;             //跳转按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //加载布局文件
        //加载控件绑定
        mTV = (TextView)findViewById(R.id.textview);
        mRG = (RadioGroup)findViewById(R.id.radiogroup);
        mRB1= (RadioButton)findViewById(R.id.radiobutton1);
        mRB2= (RadioButton)findViewById(R.id.radiobutton2);
        mRB3= (RadioButton)findViewById(R.id.radiobutton3);
        mRB4= (RadioButton)findViewById(R.id.radiobutton4);
        mBT = (Button)findViewById(R.id.button1);
        //设置监听器
        mRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mRB3.getId()) {
                    MyToast("正确答案："+mRB3.getText()+"，恭喜你，回答正确");
                } else {
                    MyToast("回答错误！");
                }
            }
        });
        mBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到下一项测试页
                Intent intent=new Intent();
                intent.setClass(MainActivity.this, Activity_tow.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void MyToast(String str)
    {
        Toast mtoast = Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT);
        mtoast.setGravity(Gravity.TOP,0,400);
        mtoast.show();
    }
}
