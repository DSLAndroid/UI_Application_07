package com.dsl.ui_application_07;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * 功能：安卓多选按钮Demo
 *
 * 作者：单胜凌
 * 时间：2016/12/14.
 */
public class Activity_tow extends Activity {

    CheckBox mCB1;          //用于显示选项
    CheckBox mCB2;
    CheckBox mCB3;
    CheckBox mCB4;
    Button mBT2;            //提交文件按钮
    Button mBT3;            //跳转到下一项按钮
    int num=0;              //用于统计被选中的个数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tow); //加载布局文件
        initUI();                              //初始化控件
        //绑定监听器
        mCB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(mCB1.isChecked())
                {
                    num++;
                    MyToast("你选择了："+mCB1.getText());
                }
                else{
                    num--;
                }
            }
        });

        mCB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(mCB2.isChecked()){
                    num++;
                    MyToast("你选择了："+mCB2.getText());
                }
                else {
                    num--;
                }
            }
        });

        mCB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(mCB3.isChecked())
                {
                    num++;
                    MyToast("你选择了："+mCB3.getText());
                }
                else {
                    num--;
                }
            }
        });

        mCB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(mCB4.isChecked())
                {
                    num++;
                    MyToast("你选择了："+mCB4.getText());
                }
                else
                {
                    num--;
                }
            }
        });

        mBT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyToast("谢谢您的参与，您一共选择了"+num+"项！");
            }
        });

        mBT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Activity_tow.this, Activity_three.class);
                startActivity(intent);
                finish();

            }
        });

    }
    private void initUI()
    {
        mCB1 = (CheckBox)findViewById(R.id.checkbox1);
        mCB2 = (CheckBox)findViewById(R.id.checkbox2);
        mCB3 = (CheckBox)findViewById(R.id.checkbox3);
        mCB4 = (CheckBox)findViewById(R.id.checkbox4);
        mBT2 = (Button)findViewById(R.id.button2);
        mBT3 = (Button)findViewById(R.id.button3);
    }

    private void MyToast(String str)
    {
        Toast mtoast = Toast.makeText(Activity_tow.this,str,Toast.LENGTH_SHORT);
        mtoast.setGravity(Gravity.TOP,0,400);
        mtoast.show();
    }

}

