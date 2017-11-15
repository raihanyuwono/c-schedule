package com.tugas.raihan.c_schedule.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tugas.raihan.c_schedule.R;
import com.tugas.raihan.c_schedule.adapter.ChatListAdapter;
import com.tugas.raihan.c_schedule.data.ChatListData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raihanyuwono on 11/12/17.
 */

public class ChatFragment extends android.support.v4.app.Fragment {

    View root;

    RecyclerView recyclerChat;

    List<ChatListData> chatList;

    public ChatFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_chat, container, false);

        initItems();
        loadItems();

        return root;
    }

    private void loadItems() {
        recyclerChat.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerChat.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        loadChatData();
        ChatListAdapter adapter = new ChatListAdapter(chatList);
        recyclerChat.setAdapter(adapter);
    }

    private void loadChatData() {
        chatList = new ArrayList<>();
        // dummy
        for (int i = 0; i < 10; i++)
            chatList.add(new ChatListData(R.drawable.ic_launcher_background, "Group " + (i + 1), "lol"));
    }

    private void initItems() {
        recyclerChat = root.findViewById(R.id.recycler_chat_list);
    }
}
