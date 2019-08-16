package com.uas.syahrilasidiq.view;

import com.uas.syahrilasidiq.data.model.User;



public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
