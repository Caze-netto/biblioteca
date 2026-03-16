package io.github.biblioteca.book.models;

import java.time.LocalDateTime;

public class Book {
    private Long book_id;
    private String name;
    private String isbn;
    private LocalDateTime publish_year;
    private Long copy;


    public Book(Long book_id,
        String isbn, 
        String name,
        LocalDateTime publish_year,
        Long copy)
    {
        this.book_id = book_id;
        this.isbn = isbn;
        this.name = name;
        this.publish_year = publish_year;
        this.copy = copy;
    }


    public Long getId(){
        return this.book_id;
    }

    public String getName(){
        return this.name;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public LocalDateTime getPublishYear(){
        return this.publish_year;
    }

    public Long getCopy(){
        return this.copy;
    }

    public void setId(Long id){
        this.book_id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn; 
    }

    public void setPublishYear(LocalDateTime publish){
        this.publish_year = publish;
    }

    public void setCopy(Long copy){
        this.copy = copy;
    }
}