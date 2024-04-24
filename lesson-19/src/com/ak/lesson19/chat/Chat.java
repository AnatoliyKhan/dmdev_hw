package com.ak.lesson19.chat;

import com.ak.lesson19.User.User;

import java.util.List;

public class Chat {

    private String name;
    private int usersCount;
    private List<User> users;

    public Chat(String name, int usersCount) {
        this.name = name;
        this.usersCount = usersCount;
    }

    public Chat(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersCount=" + usersCount +
                '}';
    }
}
