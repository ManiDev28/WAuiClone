package com.example.waclone;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class chatFragment extends Fragment {

    public ArrayList<chatModel> chatList=new ArrayList<>();


    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.chatsegment,container,true);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initChatData();
        RecyclerView chatRecycler=view.findViewById(R.id.chatRecycler);
        chatRecycleAdapter chatAdapter=new chatRecycleAdapter(this,chatList);
        // layout.setOrientation(RecyclerView.VERTICAL);
        chatRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        chatRecycler.setAdapter(chatAdapter);
        chatAdapter.notifyDataSetChanged();
    }

    public void initChatData() {
        chatList.add(new chatModel(R.drawable.contact1, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact11, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact1, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact1, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact1, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact11, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact11, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact11, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact11, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact1, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact1, "Bruce Wayne", "It's Emergency", "11:10pm"));
        chatList.add(new chatModel(R.drawable.contact1, "Bruce Wayne", "It's Emergency", "11:10pm"));
    }



}
