package io.github.biblioteca.author.models;

public class Author {

    private Long author_id;
    private String name;
    private String nacionality;
    private String gender;

    public Author(Long author_id,
                  String name,
                  String nacionality,
                  String gender) {

        this.author_id = author_id;
        this.name = name;
        this.nacionality = nacionality;
        this.gender = gender;
    }

    public Long getId(){
        return this.author_id;
    }

    public String getName(){
        return this.name;
    }

    public String getNacionality(){
        return this.nacionality;
    }

    public String getGender(){
        return this.gender;
    }

    public void setId(Long id){
        this.author_id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNacionality(String nacionality){
        this.nacionality = nacionality;
    }
}