package com.ironhack.w2.d3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        ENUMS

        User user = new User("Adrián");
        User carlos = new User("Carlos");
        System.out.println(user);
        System.out.println(carlos);

        Category category = Category.GOLD;
        System.out.println("Category: " + category + " Points: " + category.POINTS);


//        HASHMAPS

        Map<String, String> nationalLeaders = new HashMap<>();

        nationalLeaders.put("India", "Ram Nath Kovind");
        nationalLeaders.put("Japan", "Shinzō Abe");
        nationalLeaders.put("Ecuador", "Lenín Moreno");
        nationalLeaders.put("Botswana", "Mokgweetsi Masisi");

        System.out.println(nationalLeaders);

        nationalLeaders.forEach((key, value) -> {
            System.out.println("Key: " + key + " - Value: " + value);
        });

//        System.out.println(nationalLeaders.keySet());

        Country india = new Country("India", "New Delhi", 1387297452, "Ram Nath Kovind");
        Country botswana = new Country("Botswana", "Gaborone", 2351627, "Mokgweetsi Masisi");
        Country japan = new Country("Japan", "Tokyo", 126476461, "Shinzō Abe");

        Map<String, Country> countryMap = new HashMap<>();

        countryMap.put(india.getCountryName(), india);
        countryMap.put(botswana.getCountryName(), botswana);
        countryMap.put(japan.getCountryName(), japan);

        System.out.println(countryMap);
        System.out.println(countryMap.get("India"));
    }
}
