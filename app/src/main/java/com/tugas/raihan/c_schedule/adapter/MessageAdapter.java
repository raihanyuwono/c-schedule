package com.tugas.raihan.c_schedule.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tugas.raihan.c_schedule.R;
import com.tugas.raihan.c_schedule.data.MessageData;
import com.tugas.raihan.c_schedule.viewholder.MessageViewHolder;

import java.util.List;

import static com.tugas.raihan.c_schedule.StaticVariable.LABEL_OTHER;
import static com.tugas.raihan.c_schedule.StaticVariable.LABEL_OWN;

/**
 * Created by raihanyuwono on 11/22/17.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {

    private List<MessageData> listMessage;

    public MessageAdapter(List<MessageData> listMessage) {
        this.listMessage = listMessage;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType == LABEL_OWN ? R.layout.bubble_user :
                R.layout.bubble_other, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        MessageData current = listMessage.get(position);
        holder.bind(current.getMessage());
    }

    @Override
    public int getItemCount() {
        return listMessage.size();
    }

    @Override
    public int getItemViewType(int position) {
        MessageData current = listMessage.get(position);
        return current.getId() == LABEL_OWN ? LABEL_OWN : LABEL_OTHER;
    }
}
