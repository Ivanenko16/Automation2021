package streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streams.task2.Book;

import java.util.Arrays;

import java.util.List;

public class Task2Test {

    private static final List<Book> listOfBooks = Arrays.asList(
            new Book("Name1", 2),
            new Book("Name1", 1),
            new Book("Name1", 3),
            new Book("Name4", 4),
            new Book("Name5", 5),
            new Book("Name6", 6)
    );

    @Test
    public void checkSortedListOfBooks() {
        boolean sorted = Book.createSortedListOfBooks(listOfBooks).equals(listOfBooks);
        Assertions.assertFalse(sorted);
    }
}
