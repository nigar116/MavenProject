package com.cybertek.utilites;

public class Singleton {
    private  static String str;
    public static String get(){
        if (str==null){
            System.out.println("adding value");
            str ="asslddjsadj";

        }

        return  str ;


    }
}
