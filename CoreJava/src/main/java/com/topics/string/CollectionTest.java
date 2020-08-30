package com.topics.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {

        List<String> optOuts = new ArrayList<>();

        for(int i=0; i<1000000; i++) {
            optOuts.add("String"+i);
        }

        List<String> targets = new ArrayList<>();

        for(int i=0; i<1000000; i++) {
            targets.add("String"+i);
        }

        System.out.println("List populated");


        //targets.removeAll(optOuts);

        targets.removeAll(new HashSet<>(optOuts));

        System.out.println(targets.size());

    }

}
