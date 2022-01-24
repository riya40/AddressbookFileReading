package com.bl.files;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReaderFiles {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            FileReader path = new FileReader("E:\\java/output.json");  //path to the JSON file.
            JSONObject data = (JSONObject) parser.parse(path);
            String json = data.toJSONString();
            System.out.println(json);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}


