package com.hash;
public class Book {
    int id;
    String name;
    String address;
    public Book(int id, String name){
        this.id=id;
        this.name=name;
       

    }
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';

    //public static void main(String[] args) {
        // Your Code goes here!

    }
}