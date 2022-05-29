package com.dmdev.homework.week4.combineChatList;
/*
Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь,
который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
Задача:
- Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
- С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

import java.util.*;

public final class ChatCombinerUtil {

    private ChatCombinerUtil() {
    }

    public static List<User> extractAdultUsers(List<Chat> chatList) {
        Map<Integer, User> adultUserList = new HashMap<>();

        for (Chat chat : chatList) {
            for (User user : chat.getUserlist()) {
                if (user.getAge() > 18) {
                    adultUserList.put(user.getId(), user);
                }
            }
        }
        return new ArrayList<>(adultUserList.values());
    }

    public static int calculateMiddleAge(List<User> userList) {
        int sum = 0;
        Iterator<User> itr = userList.listIterator();
        while (itr.hasNext()){
            sum += itr.next().getAge();
        }
             return sum / userList.size();
    }

    public static void printUserList(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("*******************************************");
    }
}