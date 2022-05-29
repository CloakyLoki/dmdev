package com.dmdev.homework.week4.chatsBelowThousandUsers.comparator;

import com.dmdev.homework.week4.chatsBelowThousandUsers.Chat;
import java.util.Comparator;

public class UserNumberComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o2.getUserNumber(), o1.getUserNumber());
    }
}
