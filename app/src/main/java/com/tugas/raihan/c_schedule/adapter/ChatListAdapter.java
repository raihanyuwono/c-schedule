package com.tugas.raihan.c_schedule.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.tugas.raihan.c_schedule.R;
import com.tugas.raihan.c_schedule.data.ChatListData;
import com.tugas.raihan.c_schedule.viewholder.ChatListViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class ChatListAdapter extends RecyclerView.Adapter<ChatListViewHolder> {


    private List<ChatListData> chatList;

    public ChatListAdapter(List<ChatListData> chatList) {
        this.chatList = chatList;
    }

    @Override
    public ChatListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_chatlist, parent, false);
        return new ChatListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ChatListViewHolder holder, int position) {
        holder.bind(chatList.get(position));
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public void add(int photo, String name, String message) {
        chatList.add(new ChatListData(photo, name, message));
    }

    public void updateMessage(int position, String message) {
        chatList.get(position).setLastMessage(message);
    }

}
