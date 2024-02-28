package com.ysms3.ms3.models;

import java.util.Arrays;
import java.util.List;

public record Student(String id, String firstName, String lastName,String address ,String telephone) {

    private static List<Student> authors = Arrays.asList(
            new Student("author-1", "Joanne", "Rowling", "dakar", "781255555"),
            new Student("author-2", "Herman", "Melville","dakar", "781255555"),
            new Student("author-3", "Anne", "Rice", "dakar", "781255555")
    );

    public static Student getById(String id) {
        return authors.stream().filter(author -> author.id().equals(id)).findFirst().orElse(null);
    }
    public static List<Student> findALl() {
        return authors;
    }

    public static List<Student> search(String keyword) {
        return authors.stream().filter(author -> author.firstName.equals(keyword)).toList();
    }

}