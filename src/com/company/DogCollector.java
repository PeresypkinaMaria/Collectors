package com.company;

import java.util.*;
import java.util.stream.Collector;

public class DogCollector {
    //создание списка с именами собак, возраст которых больше 7 лет
    public static <D> Collector<Dog, ArrayList<Dog>, ArrayList<String>> getOldDog() {
        return Collector.<Dog, ArrayList<Dog>, ArrayList<String>>of(
                () -> new ArrayList<Dog>(),
                (list, item) -> list.add(item),
                (list1, list2) -> {
                    list1.addAll(list2);
                    return list1;
                },
                list -> {
                    ArrayList<String> result = new ArrayList<String>();
                    for (int i = 0; i < list.size(); i++){
                        if (list.get(i).getAge() > 7){
                            result.add(list.get(i).getName());
                        }
                    }
                    return result;
                });
    }
}