package com.dmdev.homework.week4.chatsBelowThousandUsers;

public class Chat implements Comparable<Chat> {

    private final String chatName;
    private final int userNumber;

    public Chat(String chatName, int userNumber) {
        this.chatName = chatName;
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return "Чат {" +
                "Название='" + chatName + '\'' +
                ", Пользователей=" + userNumber +
                '}';
    }

    public String getChatName() {
        return chatName;
    }

    public int getUserNumber() {
        return userNumber;
    }

    //Реализация сортировки по умолчанию
    @Override
    public int compareTo(Chat o) {
        return chatName.compareTo(o.getChatName());
    }
}
