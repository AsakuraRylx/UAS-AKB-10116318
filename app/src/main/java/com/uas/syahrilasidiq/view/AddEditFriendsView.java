package com.uas.syahrilasidiq.view;

import android.widget.EditText;

import com.uas.syahrilasidiq.data.model.Friends;



public interface AddEditFriendsView {
    void showData();
    void onFriendAdded();
    void onFriendUpdated(Friends friend);
    void showError(EditText et);
    void showFailed(String msg);
}
