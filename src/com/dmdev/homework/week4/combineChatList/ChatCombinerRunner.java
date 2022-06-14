package com.dmdev.homework.week4.combineChatList;

import java.util.*;

import static com.dmdev.homework.week4.combineChatList.ChatCombinerUtil.*;

public class ChatCombinerRunner {

    public static void main(String[] args) {
        User andrey = new User(1, "Andrey", 30);
        User nikolay = new User(2, "Nikolay", 17);
        User petr = new User(3, "Petr", 21);
        User vasily = new User(4, "Vasily", 15);
        User artem = new User(5, "Artem", 37);
        User anna = new User(6, "Anna", 19);
        User maria = new User(7, "Maria", 31);
        User elena = new User(8, "Elena", 16);
        User kira = new User(9, "Kira", 10);
        User anastasia = new User(10, "Anastasia", 25);
        User vera = new User(11, "Vera", 22);
        User pavel = new User(12, "Pavel", 20);

        List<User> boysChatRoom = new ArrayList<>();
        boysChatRoom.add(andrey);
        boysChatRoom.add(nikolay);
        boysChatRoom.add(petr);
        boysChatRoom.add(pavel);
        boysChatRoom.add(vasily);
        boysChatRoom.add(artem);

        List<User> girlsChatRoom = new ArrayList<>();
        girlsChatRoom.add(anna);
        girlsChatRoom.add(maria);
        girlsChatRoom.add(elena);
        girlsChatRoom.add(kira);
        girlsChatRoom.add(anastasia);

        List<User> commonChatRoom = new ArrayList<>();
        commonChatRoom.add(vasily);
        commonChatRoom.add(nikolay);
        commonChatRoom.add(vera);

        Chat boysChat = new Chat("Мужской чат", boysChatRoom);
        Chat girlsChat = new Chat("Женский чат", girlsChatRoom);
        Chat commonChat = new Chat("Общий чат", commonChatRoom);

        List<Chat> chatList = Arrays.asList(boysChat, girlsChat, commonChat);
        printUserList(extractAdultUsers(chatList));
        System.out.println("Средний возраст совершеннолетних участников составляет " + calculateAverageAge(extractAdultUsers(chatList)) + " лет.");
    }
}