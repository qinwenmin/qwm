package com.example.demo.Common.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
@Service
public class RestUtil {
    public String getMethod(String url) throws IOException {
        URL restUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) restUrl.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if(conn.getResponseCode()!=200){
            throw new RuntimeException("HTTP GET Request Failed with Error code : "
                    + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String returnStr = "";
        while ((line = br.readLine()) != null) {
            returnStr = returnStr+line;
        }
        br.close();
        System.out.println(returnStr);
        return returnStr;
    }
    public String postMethed(String url,String params) throws IOException{
        URL restUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) restUrl.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Accept", "application/json");
        PrintStream ps = new PrintStream(conn.getOutputStream());
        ps.print(params);
        ps.close();
        if(conn.getResponseCode()!=200){
            throw new RuntimeException("HTTP Error code : "
                    + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String returnStr = "";
        while ((line = br.readLine()) != null) {
            returnStr = returnStr+line;
        }
        br.close();
        System.out.println(br.readLine());
        return returnStr;
    }
}
