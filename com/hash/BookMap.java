package com.hash;

import java.util.*;

//using map 
public class BookMap{
    private  static String[][] library=new String[50][50];
    static int numofshelf=50;
    static int numlocpershelf=50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1=new Book(1,"book 1");
           Book b2=new Book(2,"book 2");
           Book b3=new Book(3,"book 3");
         Book b4=new Book(4,"book 4");  
        b1.address=hashAddress(b1);
        b2.address=hashAddress(b2);
        b3.address=hashAddress(b3);
        b4.address=hashAddress(b4);


        Map<Integer, Book> map = new HashMap<>();
        map.put(b1.id, b1);
        map.put(b2.id, b2);
        map.put(b3.id, b3);
        map.put(b4.id, b4);
        System.out.println("Enter the id of book to search :");
        int id=sc.nextInt();
        Book book=map.get(id);
        System.out.println(book);//contains.id to check for null book id
    }
        private static String hashAddress(Book b){
            //calculate index /bucket

            int shelfno=b.id % numofshelf; 
            // used +1, but this is an index so in for loop indexoutofbound
// check for free location
            for(int loc=0;loc<numlocpershelf;loc++){
                if(library[shelfno][loc]==null){
                    library[shelfno][loc]="Book:" + b.id;
                    return b.id+ "#"+"S" +(shelfno +1) + "#" + "L"+( loc+1);
                }
           }
            return null;


        }}



    