package com.topics.collection.queue;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * element:
 * Retrieves, but does not remove, the head of this queue.
 * This method differs from peek only in that it throws an exception if this queue is empty.
 * This implementation returns the result of peek unless the queue is empty.
 * <p>
 * peek:
 * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 * <p>
 * poll:
 * Retrieves and removes the head of this queue, or returns null if this queue is empty.
 */
public class PriorityQueueExample {

    private PriorityQueueExample() {
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Element(20, "Before last"));
        priorityQueue.add(new Element(5, "Little high"));
        priorityQueue.add(new Element(40, "More than Last"));
        priorityQueue.add(new Element(0, "Urgent"));
        priorityQueue.add(new Element(30, "Always Last"));
        priorityQueue.add(new Element(15, "Normal"));

        while(!priorityQueue.isEmpty()) {
            //System.out.println(priorityQueue.element());
            System.out.print(priorityQueue.peek().getName() + " : ");
            System.out.println(priorityQueue.poll().getPriority());
        }

        System.out.println(priorityQueue.peek());

        try {
            System.out.println(priorityQueue.element());
        } catch (NoSuchElementException e) {
            System.out.println("Priority queue is empty");
        }
    }

    public static void main(String[] args) {
        new PriorityQueueExample();
    }
}

class Element implements Comparable<Element> {

    private int priority;
    private String name;

    Element(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Element element) {
        return Integer.compare(this.priority, element.priority);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element)) return false;
        Element element = (Element) o;
        return getPriority() == element.getPriority() &&
                getName().equals(element.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPriority(), getName());
    }
}
