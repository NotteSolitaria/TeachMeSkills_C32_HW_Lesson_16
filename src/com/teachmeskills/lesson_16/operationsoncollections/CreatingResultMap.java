package com.teachmeskills.lesson_16.operationsoncollections;

import com.teachmeskills.lesson_16.collections.CollectionsOfPassports;
import com.teachmeskills.lesson_16.collections.CollectionsOfStudents;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreatingResultMap {
    public static Map<String, String> resultMap() {

        if (CollectionsOfPassports.passports().size() == CollectionsOfStudents.students().size()) {

            try {

                Map<String, String> resultMap = new HashMap<>();

                Set<String> passports = CollectionsOfPassports.passports();
                Set<String> students = CollectionsOfStudents.students();

                Iterator<String> passportIterator = passports.iterator();
                Iterator<String> studentIterator = students.iterator();

                while (passportIterator.hasNext() && studentIterator.hasNext()) {
                    String passport = passportIterator.next();
                    String student = studentIterator.next();
                    resultMap.put(passport, student);
                }

                return resultMap;

            } catch (Exception e) {

                throw new RuntimeException("The entered data is incorrect.");

            }

        }

        return resultMap();
    }
}