package com.uas.syahrilasidiq.view;

import com.uas.syahrilasidiq.data.model.Friends;



public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
