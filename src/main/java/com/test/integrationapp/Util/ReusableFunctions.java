package com.test.integrationapp.Util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReusableFunctions {
    public static String readJsonData(String node, String field) {
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader("./src/test/resources/data/config.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jo = (JSONObject) obj;
        return (String) ((JSONObject) jo.get(node)).get(field);
    }
}
