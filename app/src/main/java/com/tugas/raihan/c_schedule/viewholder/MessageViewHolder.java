package com.tugas.raihan.c_schedule.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tugas.raihan.c_schedule.R;
import com.tugas.raihan.c_schedule.data.MessageData;

/**
 * Created by raihanyuwono on 11/22/17.
 */

public class MessageViewHolder extends RecyclerView.ViewHolder {

    private TextView message;

    public MessageViewHolder(View itemView) {
        super(itemView);
        message = itemView.findViewById(R.id.chat_message);
    }

    public void bind(String message) {
        this.message.setText(message);
    }
}
