package com.example.btvclient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 设置导航按钮点击事件
        Button navHome = findViewById(R.id.nav_home);
        Button navCategory = findViewById(R.id.nav_category);
        Button navLive = findViewById(R.id.nav_live);
        Button navFeed = findViewById(R.id.nav_feed);
        Button navProfile = findViewById(R.id.nav_profile);

        // 获取 RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view_home);

        // 设置布局管理器为 GridLayout (瀑布流布局)
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 列

        // 模拟推荐视频数据
        List<String> recommendedVideos = Arrays.asList("视频1", "视频2", "视频3", "视频4");

        // 设置适配器
        VideoRecyclerAdapter adapter = new VideoRecyclerAdapter(this, recommendedVideos);
        recyclerView.setAdapter(adapter);






        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 切换到“首页”
            }
        });

        navFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 切换到“动态”
                Intent intent = new Intent(MainActivity.this, FeedActivity.class);
                startActivity(intent);
            }
        });
        // 其他按钮类似处理
    }
}
