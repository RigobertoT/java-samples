/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.tutorial.jaxrs.server;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josediaz
 */
@XmlRootElement
public class Book {
       
    private String isbn;
    private String title;

    public Book() {
    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + "]";
    }
}
