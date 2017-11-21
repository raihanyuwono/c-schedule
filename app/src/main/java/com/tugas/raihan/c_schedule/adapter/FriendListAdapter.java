package com.tugas.raihan.c_schedule.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tugas.raihan.c_schedule.R;
import com.tugas.raihan.c_schedule.data.FriendListData;
import com.tugas.raihan.c_schedule.viewholder.FriendListViewHolder;

import java.util.List;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class FriendListAdapter extends RecyclerView.Adapter<FriendListViewHolder> {

    private List<FriendListData> friendList;

    public FriendListAdapter(List<FriendListData> friendList) {
        this.friendList = friendList;
    }

    @Override
    public FriendListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_friendlist, parent, false);
        return new FriendListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendListViewHolder holder, int position) {
        FriendListData current = friendList.get(position);
        holder.bind(current.getPhoto(), current.getUsername());
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

}
