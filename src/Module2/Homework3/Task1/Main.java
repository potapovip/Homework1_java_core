package Module2.Homework3.Task1;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        User ilya = new User(18, "Ilya");
        User ilya1 = new User(19, "Ilya");
        User vasya = new User(20, "Vasya");
        User vasya1 = new User(21, "Vasya");

        HashSet<User> users = new HashSet<User>();
        users.add(ilya);
        users.add(ilya1);
        users.add(vasya);
        users.add(vasya1);
        System.out.println(users);
    }
}
