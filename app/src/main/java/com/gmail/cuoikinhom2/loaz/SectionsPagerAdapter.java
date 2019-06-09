package com.gmail.cuoikinhom2.loaz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DuyTran on 08/06/19.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter{
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


        switch(position)
        {
            case 0:
                RequestFragment requestFragment=new RequestFragment();
                return  requestFragment;
            case 1:
                ChatsFragment chatsFragment=new ChatsFragment();
                return  chatsFragment;

                case 2:
            FriendsFragment friendsFragment=new FriendsFragment();
            return  friendsFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position)
    {
        switch(position)
        {
            case 0:
                return "Yêu cầu kết bạn";
            case 1:
                return "Trò chuyện";
            case 2:
                return "Bạn bè";
                default:
                    return null;
        }
    }
}
