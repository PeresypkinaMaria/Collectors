package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.company.DogCollector.getOldDog;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> oldDog = new ArrayList<String>();
        oldDog = Stream.of(new Dog("Snoopy", 7), new Dog("Chips", 10),
                new Dog("Chubaka", 4), new Dog("Voody", 1), new Dog("Drug", 13),
                new Dog("Sharik", 8)).collect(getOldDog());
        oldDog.forEach(d -> System.out.println(d));
    }
}
