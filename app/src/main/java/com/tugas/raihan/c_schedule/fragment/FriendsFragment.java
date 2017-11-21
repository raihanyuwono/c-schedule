package com.tugas.raihan.c_schedule.fragment;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tugas.raihan.c_schedule.R;
import com.tugas.raihan.c_schedule.adapter.FriendListAdapter;
import com.tugas.raihan.c_schedule.data.FriendListData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raihanyuwono on 11/12/17.
 */

public class FriendsFragment extends android.support.v4.app.Fragment {

    private View root;

    private RecyclerView recyclerFriends;

    private List<FriendListData> listFriends;

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
        recyclerFriends.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        loadFriendsData();
        FriendListAdapter adapter = new FriendListAdapter(listFriends);
        recyclerFriends.setAdapter(adapter);
    }

    private void loadFriendsData() {
        listFriends = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listFriends.add(new FriendListData(R.drawable.ic_launcher_background, "user " + (i + 1)));
        }
    }

    private void initItems() {
        recyclerFriends = root.findViewById(R.id.recycler_friend_list);
    }
}
