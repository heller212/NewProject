package Homework_10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("персик");
        list.add("абрикос");
        list.add("арбуз");
        list.add("ласточка");
        list.add("снегирь");
        list.add("арбуз");
        list.add("персик");
        list.add("голубь");
        list.add("снегирь");
        list.add("черешня");
        list.add("черешня");
        list.add("снегирь");

        int counter = 0;

        for (int i = 0; i < list.size(); i++) {

            String a = list.get(i);
                Iterator<String> iter = list.iterator();
                while (iter.hasNext()) {
                    String str = iter.next();
                    if (str.equals(a)) {
                        counter++;
                        iter.remove();
                    }
                }
            System.out.println(a + " встречается " + counter + " раз.");
            counter = 0;

        }
        for (String s : list) {
            System.out.println(s + " встречается 1 раз.");
        }
        System.out.println(list);

    }


}
