package com.hash;
public class HashApp{
    private  static String[][] library=new String[3][3];
    static int numofshelf=3;
    static int numlocpershelf=3;

    public static void main(String[] args) {
        Book b1=new Book(1,"book 1");
           Book b2=new Book(2,"book 2");
           Book b3=new Book(3,"book 3");
         Book b4=new Book(4,"book 4");  
        b1.address=hashAddress(b1);
        b2.address=hashAddress(b2);
        b3.address=hashAddress(b3);
        b4.address=hashAddress(b4);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        //find book details sample
        String address="2#S1#L2";
        String[] a=address.split("#");
        System.out.println("foundbook id :"+a[0]+ " at shelf :"+a[1]+ " at location: "+a[2]);
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



    