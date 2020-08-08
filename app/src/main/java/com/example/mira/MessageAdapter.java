package com.example.mira;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.message);
        }
    }

    List<ResponseMessage> message_list;

    public MessageAdapter(List<ResponseMessage>message_list) {
        this.message_list=message_list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.ViewHolder holder, int position) {
        holder.textView.setText(message_list.get(position).getTextMessage());
    }

    @Override
    public int getItemCount() {
        return message_list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(message_list.get(position).getI()==10001){
            return R.layout.user_bubble;
        } else if(message_list.get(position).getI()==10002){
            return R.layout.bot_bubble;
        }
        return 0;
    }


}
