package dev.patika;

import java.time.LocalDate;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int page;
    private LocalDate publishDate;

    public Book(String title, String author, int page, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.page = page;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book book) {
        return this.getTitle().compareTo(book.getTitle());
    }
}
