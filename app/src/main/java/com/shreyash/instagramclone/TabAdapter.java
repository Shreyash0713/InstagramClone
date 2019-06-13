package com.shreyash.instagramclone;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {


    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int tabPosition) {

        switch(tabPosition){
            case 0:
                ProfileTab profileTab = new ProfileTab();
                return profileTab;
            case 1:
                UsersTab usersTab = new UsersTab();
                return usersTab;
            case 2:
                SharePictureTab sharePictureTab= new SharePictureTab();
                return sharePictureTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        //If Adding more tabs Please change the number of tabs below
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //CharSequence is Similar to string. Default case is compulsory
        switch (position){
            case 0:
                return "Profile";

            case 1:
                return "Users";

            case 2:
                return "Share Picture";

            default:
                return null;
        }
    }
}
