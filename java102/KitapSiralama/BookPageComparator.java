package dev.patika;

import java.util.Comparator;

public class BookPageComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPage() - o2.getPage();
    }
}
