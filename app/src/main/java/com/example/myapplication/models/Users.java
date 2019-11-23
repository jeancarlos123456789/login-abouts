package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public  String password;


    public static Boolean passwordIsValid(String User, String Password){

        for (Users i: getuser()){
            if(i.username.equals(User) && i.password.equals(Password)){
                return true;
            }
        }

        return false;
    }
    public static List<Users> getuser(){
        ArrayList<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.username = "bichito";
        o.password = "123456";
        list.add(o);

        Users t = new Users();
        t.username = "jean";
        t.password = "1234567";
        list.add(t);

        return list;

    }
}
