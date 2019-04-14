package com.topics.collection.comparator;

import java.util.Comparator;

class AgeComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.getAge() < s2.getAge())
            return -1;
        else if (s1.getAge() > s2.getAge())
            return 1;
        else
            return 0;
    }
}