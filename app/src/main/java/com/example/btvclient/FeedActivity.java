package com.example.btvclient;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FeedRecyclerAdapter adapter;
    private List<String> feedList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        // 初始化 RecyclerView
        recyclerView = findViewById(R.id.recycler_view_feed);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 添加示例数据
        feedList.add("用户1：发布了新动态");
        feedList.add("用户2：分享了一段视频");
        feedList.add("用户3：更新了头像");
        adapter = new FeedRecyclerAdapter(this, feedList);
        recyclerView.setAdapter(adapter);

        // 设置按钮点击事件
        Button btnPureVideo = findViewById(R.id.btn_pure_video);
        Button btnMixed = findViewById(R.id.btn_mixed);

        btnPureVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 处理纯视频逻辑
            }
        });

        btnMixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 处理图文视频逻辑
            }
        });
    }
}
