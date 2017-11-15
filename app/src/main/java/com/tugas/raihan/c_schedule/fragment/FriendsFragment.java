package com.tugas.raihan.c_schedule.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tugas.raihan.c_schedule.R;

/**
 * Created by raihanyuwono on 11/12/17.
 */

public class FriendsFragment extends android.support.v4.app.Fragment {

    private View root;

    private RecyclerView recyclerFriends;

    public FriendsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_friends, container, false);

        initItems();
        loadItems();

        return root;
    }

    private void loadItems() {
        recyclerFriends.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void initItems() {
        recyclerFriends = root.findViewById(R.id.recycler_friend_list);
    }
}
