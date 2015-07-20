package net.mashrur.learning.javaee.jsf;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class BookEJB {

    private static List<Book> books = new ArrayList<>();


    static {

        Book aBook = new Book();
        aBook.setId((long)books.size());
        aBook.setDescription("Test Book Desciption");
        aBook.setIllustrations(true);
        aBook.setNbOfPage(2);
        aBook.setPrice(2.5f);

        books.add(aBook);
    }

    public Book createBook(Book book) {
        book.setId((long)books.size());
        books.add(book);

        return book;
    }


    public List<Book> findAllBooks() {
        for(Book aBook:books){
            System.out.println(aBook.getId());
            System.out.println(aBook.getTitle());
        }
        return books;
    }

    public Book findBookById(Long id){
        return books.get(0);
    }
}
