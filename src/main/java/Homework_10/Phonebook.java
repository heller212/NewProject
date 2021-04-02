package Homework_10;

import java.util.*;

public class Phonebook{

    public Phonebook() {
    }
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    ArrayList<String> phoneList = new ArrayList<>();

    public void add() {
        System.out.println("Введите фамилию:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Введите номер:");
        Scanner scanner1 = new Scanner(System.in);
        String phone = scanner1.next();
        phoneList.add(phone);

        map.put(name, phoneList);

    }

    public void get(String e) {
        ArrayList<String> number = map.get(e);
        System.out.println(number);

    }
}
