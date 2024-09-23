package com.example.btvclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FeedRecyclerAdapter extends RecyclerView.Adapter<FeedRecyclerAdapter.ViewHolder> {
    private List<String> feedList; // 存储动态数据
    private Context context;

    public FeedRecyclerAdapter(Context context, List<String> feedList) {
        this.context = context;
        this.feedList = feedList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_feed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.feedText.setText(feedList.get(position)); // 设置动态内容
    }

    @Override
    public int getItemCount() {
        return feedList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView feedText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            feedText = itemView.findViewById(R.id.feed_text);
        }
    }
}
