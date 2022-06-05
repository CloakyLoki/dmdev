package com.dmdev.homework.week4.combineChatList;

import java.util.List;

public class Chat {

    private final String chatName;
    private final List<User> userList;

    public Chat(String chatName, List<User> userlist) {
        this.chatName = chatName;
        this.userList = userlist;
    }

    public List<User> getUserlist() {
        return userList;
    }
}