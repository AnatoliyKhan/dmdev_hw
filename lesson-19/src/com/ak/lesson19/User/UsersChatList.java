package com.ak.lesson19.User;

import com.ak.lesson19.chat.Chat;

import java.util.*;

public class UsersChatList {

    public static void main(String[] args) {

        List<User> userListA = Arrays.asList(
                new User(1, "Andrey", 24),
                new User(51, "Michael", 17)
        );

        List<User> userListB = Arrays.asList(
                new User(3, "Petr", 28),
                new User(29, "Evgeniy", 15)
        );

        List<Chat> chatList = Arrays.asList(
                new Chat("Chat A", userListA),
                new Chat("Chat B", userListB)
        );

        List<User> usersOver18 = new ArrayList<>();
        for(Chat chat : chatList) {
            for (User user : chat.getUsers()) {
                if(user.getAge() > 18){
                    usersOver18.add(user);
                }
            }
        }

        System.out.println("Список пользователей старше 18: ");
        for (User user : usersOver18) {
            System.out.println(user);
        }

        //Average age
        double totalAge = 0;
        int count = 0;
        Iterator<User> iterator = usersOver18.iterator();
        while (iterator.hasNext()){
            totalAge += iterator.next().getAge();
            count++;
        }
        double averageAge = totalAge / count;

        System.out.println("\nСредний возраст оставшихся пользователей: " + averageAge);
    }
}
