package com.example.waclone;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class tabviewAdapter extends FragmentStateAdapter {

    private String tabs[]={"Chats","Status","Calls"};
    public tabviewAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position) {
            case 0:
              return new chatFragment();
                case 1:
                  return new statusFragment();
                    case 2:
                       return new callFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return tabs.length;
    }
}
