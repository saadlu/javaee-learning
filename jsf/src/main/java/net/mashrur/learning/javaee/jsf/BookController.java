package net.mashrur.learning.javaee.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class BookController {

    @Inject
    private BookEJB bookEJB;

    private static Book aBook;
    static {

        aBook = new Book();
        aBook.setId(0L);
        aBook.setTitle("Test Book title");
        aBook.setDescription("Test Book Desciption");
        aBook.setIllustrations(true);
        aBook.setNbOfPage(2);
        aBook.setPrice(2.5f);

    }
    private Book book = new Book();


    public String doCreateBook() {
        System.out.println("Creating a book with title: " + book.getTitle());

        bookEJB.createBook(book);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Book not created",
                "The book" + book.getTitle() + " has been created with id=" + book.getId()));
        return "newBook.xhtml";
    }

    public void doFindBookById(){
        book = bookEJB.findBookById(0L);
    }

    public Book getBook(){

        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }
}
