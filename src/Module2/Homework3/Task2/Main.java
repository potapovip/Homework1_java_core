package Module2.Homework3.Task2;

import Module2.Homework3.Task1.User;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        UserBroken ilya = new UserBroken(18, "Ilya");
        UserBroken vladislav = new UserBroken(19, "Vladislav");
        UserBroken petr = new UserBroken(20, "Petr");
        HashSet<UserBroken> users = new HashSet<>();
        users.add(ilya);
        users.add(vladislav);
        users.add(petr);
        users.add(ilya);
        System.out.println(users);


    }
}
