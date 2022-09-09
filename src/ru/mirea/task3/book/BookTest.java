package ru.mirea.task3.book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book(
                "Pushkin",
                "Evgeniy Onegin",
                1750,
                "The best book",
                300
        );
        System.out.println(book);
    }
}
