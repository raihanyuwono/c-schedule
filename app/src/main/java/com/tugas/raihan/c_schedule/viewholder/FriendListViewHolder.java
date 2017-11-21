package com.tugas.raihan.c_schedule.viewholder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tugas.raihan.c_schedule.ChatActivity;
import com.tugas.raihan.c_schedule.R;

import static com.tugas.raihan.c_schedule.StaticVariable.LABEL_CHAT;

/**
 * Created by raihanyuwono on 11/13/17.
 */

public class FriendListViewHolder extends RecyclerView.ViewHolder {

    private ImageView photo;
    private TextView username;

    public FriendListViewHolder(final View itemView) {
        super(itemView);
        this.photo = itemView.findViewById(R.id.photo_profile);
        this.username = itemView.findViewById(R.id.username);

        this.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(itemView.getContext(), ChatActivity.class);
                intent.putExtra(LABEL_CHAT, username.getText());
                itemView.getContext().startActivity(intent);
            }
        });
    }

    public void bind(int photo, String username){
        // TO DO change to firebase
        this.photo.setImageResource(photo);
        this.username.setText(username);
    }

}
