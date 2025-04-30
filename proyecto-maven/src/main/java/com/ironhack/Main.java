package com.ironhack;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Case of Charles Dexter Ward", 181));
        books.add(new Book("At the Mountains of Madness", 256));
        books.add(new Book("The Whisperer in Darkness", 224));
        Author author = new Author("Howard Phillips", "Lovecraft", books);
        Gson gson = new Gson();
        System.out.println(gson.toJson(author));


    }
}
