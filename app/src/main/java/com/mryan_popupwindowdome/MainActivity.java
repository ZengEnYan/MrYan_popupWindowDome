package com.mryan_popupwindowdome;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPop(View view) {
        /**
         * 首先第一个参数,contentView提供一个展示的内容视图
         * 第二个参数是宽
         * 第三个是高
         * 这里我们做的是指定 popuwindow的视图
         */
        View contentView = View.inflate(this,R.layout.pop_item,null);
        PopupWindow popupWindow = new PopupWindow(contentView, ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
       /*popuWindow的属性,设置成true代表在popuwindow外部可以点击且popwindow会消失*/
        popupWindow.setOutsideTouchable(true);

        /**
         * 在某一控件下边   anchor(锚的意思)
         */
        popupWindow.showAsDropDown(findViewById(R.id.bt_mune),0,0);
        /*查找popitem中的ID*/
        TextView tv_cumputer = (TextView) contentView.findViewById(R.id.tv_cumputer);
        TextView tv_jinRong = (TextView) contentView.findViewById(R.id.tv_jinRong);
        TextView tv_manage = (TextView) contentView.findViewById(R.id.tv_manage);
        /*给查找到的ID设置点击事件*/
        tv_cumputer.setOnClickListener(this);
        tv_jinRong.setOnClickListener(this);
        tv_manage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_cumputer:
                //成功后的吐丝
                Toast.makeText(MainActivity.this, "点击了计算机", Toast.LENGTH_SHORT).show();
                break;

            case R.id.tv_jinRong:
                //成功后的吐丝
                Toast.makeText(MainActivity.this, "点击了金融", Toast.LENGTH_SHORT).show();
                break;

            case R.id.tv_manage:
                //成功后的吐丝
                Toast.makeText(MainActivity.this, "点击了管理", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
