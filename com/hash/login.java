package com.hash;

import java.util.*;

public class login {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("----Login System----");
        System.out.print("username:");
        
        String username=sc.next();
        System.out.print("password:");
        String password=sc.next();
        LoginService ls=new LoginService();
        boolean isvalid=ls.validate(username,password);
        if(isvalid){
            System.out.println("Login successful");
        }
        else{
            System.out.println("invalid credentials");
        }
        sc.close();

         

        // Your Code goes here!

    }
}