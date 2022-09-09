package ru.mirea.task4.author;

public class AuthorTest {

    public static void main(String[] args) {
        Author author = new Author(
                "Nikita",
                "nikita.simashkin@gmail.com",
                'M'
        );
        System.out.println(author);
    }
}
