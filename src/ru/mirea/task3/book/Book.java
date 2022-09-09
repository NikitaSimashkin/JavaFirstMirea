package ru.mirea.task3.book;

public class Book {
    private String author;
    private String name;
    private int year;
    private String description;
    private int numberOfPages;

    public Book(String author, String name, int year, String description, int numberOfPages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.description = description;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
