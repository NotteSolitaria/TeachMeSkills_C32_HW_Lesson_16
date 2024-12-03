package com.teachmeskills.lesson_16;

import com.teachmeskills.lesson_16.operationsoncollections.CreatingResultMap;

import java.util.Map;

/**
 * Create a collection of passport numbers (String format).
 * Create a collection of students in our group.
 * Each collection should not have duplicate elements.
 * Create a key-value collection, where the key will be the passport number from the first collection, and the value will be the Student class object from the second collection.
 * Loop through the key-value collection with a for-each loop and display the collection elements on the screen.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Map<String , String> resultMap = CreatingResultMap.resultMap();

        for (Map.Entry<String, String> entry : resultMap.entrySet()) {
            System.out.println("Passport: " + entry.getKey() + ", Student: " + entry.getValue());
        }
    }
}
