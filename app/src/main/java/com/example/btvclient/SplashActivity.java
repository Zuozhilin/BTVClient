package com.example.btvclient;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 创建一个 FrameLayout 来充当 Splash 界面的背景容器
        FrameLayout splashLayout = new FrameLayout(this);
        splashLayout.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
        ));

        // 获取当前的小时数，判断是白天还是夜晚
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        // 根据时间设置不同的启动图背景
        if (hour >= 6 && hour < 18) {
            splashLayout.setBackgroundResource(R.drawable.splash_day);  // 白天背景
        } else {
            splashLayout.setBackgroundResource(R.drawable.splash_night);  // 夜晚背景
        }

        // 设置布局为当前活动的内容视图
        setContentView(splashLayout);

        // 使用 Handler 延迟 2 秒后启动 MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();  // 结束 SplashActivity，使其不再回到这个界面
            }
        }, 2000);  // 延迟 2 秒
    }
}
