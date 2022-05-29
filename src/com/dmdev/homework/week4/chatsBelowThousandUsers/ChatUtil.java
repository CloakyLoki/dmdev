package com.dmdev.homework.week4.chatsBelowThousandUsers;

import java.util.Iterator;
import java.util.List;

public final class ChatUtil {

    private ChatUtil() {
    }

    public static List<Chat> removeChatsBelowThousandUsers(List<Chat> chats) {
        Iterator<Chat> chatIterator = chats.iterator();
        while (chatIterator.hasNext()) {
            if (chatIterator.next().getUserNumber() < 1000) {
                chatIterator.remove();
            }
        }
        return chats;
    }

    public static void printChatList(List<Chat> chats) {
        for (Chat chat : chats) {
            System.out.println(chat.toString());
        }
        System.out.println("*****************************************");
    }
}
