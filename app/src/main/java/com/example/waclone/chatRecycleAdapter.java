package com.example.waclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class chatRecycleAdapter extends RecyclerView.Adapter<chatRecycleAdapter.ViewHolder> {

    private List<chatModel> chatList;

    public chatRecycleAdapter(chatFragment chatFragment, List<chatModel> chatList) { this.chatList = chatList; }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      int img=chatList.get(position).getDp();
      String name=chatList.get(position).getContact();
      String msg=chatList.get(position).getMessage();
      String time1=chatList.get(position).getTime();
      holder.setData(img,name,msg,time1);
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView image1;
        private TextView contact;
        private TextView message;
        private TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1=itemView.findViewById(R.id.image1);
            contact=itemView.findViewById(R.id.contact);
            message=itemView.findViewById(R.id.message);
            time=itemView.findViewById(R.id.time);
        }


        public void setData(int img, String name, String msg, String time1) {
            image1.setImageResource(img);
            contact.setText(name);
            message.setText(msg);
            time.setText(time1);
        }
    }
}
