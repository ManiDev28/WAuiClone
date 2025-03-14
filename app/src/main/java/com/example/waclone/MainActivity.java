package com.example.waclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewpager;
    private TabLayout tabLayout;
    private tabviewAdapter tadAdapter;
    private String tabs[]={"Chats","Status","Calls"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set adapter for fragments
        tabLayout=findViewById(R.id.whatsapptab_layout);
        viewpager=findViewById(R.id.fragmentContainer);
        tabviewAdapter tabAdapter = new tabviewAdapter(this);
        viewpager.setAdapter(tabAdapter);
        new TabLayoutMediator(tabLayout,viewpager,((tab,position)->tab.setText(tabs[position]))).attach();
    }


}