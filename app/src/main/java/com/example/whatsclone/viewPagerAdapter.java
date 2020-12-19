package com.example.whatsclone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {

  public viewPagerAdapter(@NonNull FragmentManager fm) {
    super(fm);
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
    switch (position){
      case 0: return new Chats();
      case 1: return new Status();
      case 2: return new Calls();
    }
    return null;
  }

  @Override
  public int getCount() {
    return 3;
  }

  @Nullable
  @Override
  public CharSequence getPageTitle(int position) {
    switch (position){
      case 0: return "CHATS";
      case 1: return "STATUS";
      case 2: return "CALLS";
    }
    return null;
  }
}
