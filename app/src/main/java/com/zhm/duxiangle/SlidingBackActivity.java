package com.zhm.duxiangle;


import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import com.zhm.duxiangle.view.SlidingBackLayout;

/**
 * 想要实现向右滑动删除Activity效果只需要继承SwipeBackActivity即可，如果当前页面含有ViewPager
 * 只需要调用SwipeBackLayout的setViewPager()方法即可
 *
 * @author zhm
 * @version 2015-7-11
 */
public class SlidingBackActivity extends AppCompatActivity {
    protected SlidingBackLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.hm_base_slide_right_in,
                0);
        super.onCreate(savedInstanceState);
        //1需要继承AppCompatActivity
        //2需要将背景弄成透明
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        layout = (SlidingBackLayout) LayoutInflater.from(this).inflate(
                R.layout.hm_base_activity, null);
        layout.attachToActivity(this);
    }

    // Press the back button in mobile phone
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.hm_base_slide_right_out);
    }

}