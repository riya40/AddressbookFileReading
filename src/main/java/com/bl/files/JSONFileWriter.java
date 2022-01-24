package com.bl.files;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class JSONFileWriter {
    public static void main(String args[]) {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("ID", "1");
        jsonObject.put("First_Name", "Shikhar");
        jsonObject.put("Last_Name", "Dhawan");
        jsonObject.put("Address", "11 ak street");
        jsonObject.put("City", "DRM");
        jsonObject.put("State", "DRM");
        jsonObject.put("PhoneNumber", "DRM");
        jsonObject.put("Email", "email@gmail.com");
        try {
            FileWriter file = new FileWriter("E:\\java/output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
}
