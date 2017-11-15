package com.tugas.raihan.c_schedule.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.tugas.raihan.c_schedule.viewholder.FriendListViewHolder;

import java.util.List;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class FriendListAdapter extends RecyclerView.Adapter<FriendListViewHolder> {

    private class Data {
        int photo;
        String username;
    }

    private List<Data> friendList;

    public FriendListAdapter(List<Data> friendList) {
        this.friendList = friendList;
    }

    @Override
    public FriendListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(FriendListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
