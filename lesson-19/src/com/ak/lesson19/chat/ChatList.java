package com.ak.lesson19.chat;

import com.ak.lesson19.comparator.ChatNameComparator;
import com.ak.lesson19.comparator.ChatUsersComparator;

import java.util.*;

public class ChatList {

    public static void main(String[] args) {
        List<Chat> chatList = Arrays.asList(
                new Chat("Chat A", 1005),
                new Chat("Chat B", 154),
                new Chat("Chat C", 52),
                new Chat("Chat D", 10000),
                new Chat("Chat F", 5200),
                new Chat("Chat E", 5200),
                new Chat("Chat G", 120)
        );
        List<Chat> chats = new ArrayList<>(chatList);

        Iterator<Chat> iterator = chats.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getUsersCount() < 1000){
                iterator.remove();
            }
        }

        for (Chat chat : chats) {
            System.out.println(chat);
        }

        chats.sort(new ChatUsersComparator());
        System.out.println(chats);

        chats.sort(new ChatNameComparator());
        System.out.println(chats);

    }





}
