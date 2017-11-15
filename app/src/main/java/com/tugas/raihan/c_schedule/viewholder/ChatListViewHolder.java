package com.tugas.raihan.c_schedule.viewholder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tugas.raihan.c_schedule.ChatActivity;
import com.tugas.raihan.c_schedule.R;
import com.tugas.raihan.c_schedule.StaticVariable;
import com.tugas.raihan.c_schedule.data.ChatListData;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class ChatListViewHolder extends RecyclerView.ViewHolder {

    private CircleImageView photo;
    private TextView name;
    private TextView lastMessage;

    public ChatListViewHolder(final View itemView) {
        super(itemView);

        photo = itemView.findViewById(R.id.photo_chat);
        name = itemView.findViewById(R.id.name_chat);
        lastMessage = itemView.findViewById(R.id.last_chat);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(itemView.getContext(), ChatActivity.class);
                intent.putExtra(StaticVariable.LABEL_CHAT, name.getText());
                itemView.getContext().startActivity(intent);
            }
        });

    }

    public void bind(ChatListData data) {

        // change photo to firebase
        this.photo.setImageResource(data.getPhoto());
        this.name.setText(data.getName());
        this.lastMessage.setText(data.getLastMessage());

    }

}
