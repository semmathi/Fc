package com.hash;
import java.util.*;


public class LoginService {
    Map<String,String> map=new HashMap<>();
    public LoginService(){
        map.put("sem","sem@123");
        map.put("santhi","santhi@123");
    }

    public boolean validate(String username, String password){
        if(map.containsKey(username)){
            String originalpwd=map.get(username);
            if(originalpwd.equals(password)){
                return true;
            }
            else{
                return false;
            }}
        else{
                return false;
            }
        
    }

    
}