package com.cybertek.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        //this is the path to the location of the file
        String path ="configuration.properties";

        try{
            //java cannot read files directly,it need inputstrem to read files
            //inputstream take the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);

            //properties is used to read specificaly properties file,file with key value pais
            properties = new  Properties();
            //file contents are load to properties from the inputstram
            properties.load(fileInputStream);

            //all input steams must be closed
            fileInputStream.close();


        }catch (IOException e){
            e.printStackTrace();
        }

    }
    //return the value of specific property
    public static String getProperty(String property){
        return properties.getProperty(property);
    }

}
