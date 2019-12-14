package com.example.rajveer_c0758564_ft;

import java.util.ArrayList;

public class Information {
    private String myName;
    private String myEmail;
    private String myPhone;
    public Information(String myName , String myEmail , String myPhone){
        this.myEmail = myEmail;
        this.myName = myName;
        this.myPhone = myPhone;
    }
    public  String getMyName() {
        return myName;
    }
    public  String getMyEmail() {
        return myEmail;
    }
    public  String getMyPhone() {
        return myPhone;
    }
    public static  final ArrayList<Information> information = new ArrayList<>();
}
