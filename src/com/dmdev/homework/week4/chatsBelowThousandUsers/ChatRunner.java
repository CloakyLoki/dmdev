package com.dmdev.homework.week4.chatsBelowThousandUsers;
/*
Дан список чатов.
Каждый чат состоит из двух полей: название и количество пользователей в этом чате.

Задача:
- Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
- Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает,
то по названию в алфавитном порядке.
- Также предоставить сортировку чатов по названию по умолчанию.
 */

import com.dmdev.homework.week4.chatsBelowThousandUsers.comparator.ChatNameComparator;
import com.dmdev.homework.week4.chatsBelowThousandUsers.comparator.UserNumberComparator;
import java.util.LinkedList;
import java.util.List;
import static com.dmdev.homework.week4.chatsBelowThousandUsers.ChatUtil.*;

public class ChatRunner {

    public static void main(String[] args) {

        List<Chat> chatList = new LinkedList<>();
        chatList.add(new Chat("Lepra", 5000));
        chatList.add(new Chat("PopMech", 900));
        chatList.add(new Chat("MoscowNews", 7700));
        chatList.add(new Chat("Pikabu", 1200));
        chatList.add(new Chat("RedditLive", 720));
        chatList.add(new Chat("JavaLearning", 7700));

        System.out.println("Исходный список:");
        printChatList(chatList);
        System.out.println("Удалены чаты <1000 пользователей:");
        printChatList(removeChatsBelowThousandUsers(chatList));
        System.out.println("Чаты отсортированы по количеству пользователей и названию:");
        chatList.sort(new UserNumberComparator().thenComparing(new ChatNameComparator()));
        printChatList(chatList);
    }
}
