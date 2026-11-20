package com.hash;
import java.util.*;
public class HashAppMap{
    private  static String[][] library=new String[3][3];
    static int numofshelf=3;
    static int numlocpershelf=3;



    public static void main(String[] args) {
        Book b1=new Book(1,"book 1");
           Book b2=new Book(2,"book 2");
           Book b3=new Book(3,"book 3");
         Book b4=new Book(4,"book 4");  

         
         Map<Integer, Book> map=new HashMap<>();
         map.put(b1.id,b1);
         map.put(b2.id,b2);
         map.put(b3.id,b3);
         map.put(b4.id,b4);
    }}
    // creates address, but in hashapp- done manually