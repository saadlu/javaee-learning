package net.mashrur.learning.javaee.jsf;


public class Book {

    private Long id;
    private String title;
    private Float price;
    private String description;
    private Integer nbOfPage;
    private Boolean illustrations;

    public Book(){
        title="saad";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("is this ever called: " + title);
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
