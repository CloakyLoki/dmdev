package com.dmdev.homework.week4.chatsBelowThousandUsers.comparator;

import com.dmdev.homework.week4.chatsBelowThousandUsers.Chat;
import java.util.Comparator;

public class ChatNameComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getChatName().compareTo(o2.getChatName());
    }
}
