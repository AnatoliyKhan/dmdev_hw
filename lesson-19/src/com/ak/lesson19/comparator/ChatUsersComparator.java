package com.ak.lesson19.comparator;

import com.ak.lesson19.chat.Chat;

import java.util.Comparator;

public class ChatUsersComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        if (o2.getUsersCount() == o1.getUsersCount()) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return Integer.compare(o2.getUsersCount(), o1.getUsersCount());
        }
    }
}
