package org.home;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        // queues();

        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addFirst(new Person("Ali", 18));

        ListIterator<Person> personListIterator = linkedList.listIterator();

        System.out.println("Next");

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println("Previous");

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

    }

    private static void queues() {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Mariam", 24));
        queue.add(new Person("Ali", 25));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }

    static record Person(String name, int age) {

    }


}
