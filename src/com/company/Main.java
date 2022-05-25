package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Jack", 35);
        Person p2 = new Person("Lena", 27);
        Person p3 = new Person("John", 30);

        List<Person> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());

        for (Person person : list) {
            System.out.print(person + "    ");
        }

        System.out.println("--------------------------\n");
        PersonLinkedList myList = new PersonLinkedList();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        System.out.println(myList.size());
        myList.print();
    }
}
