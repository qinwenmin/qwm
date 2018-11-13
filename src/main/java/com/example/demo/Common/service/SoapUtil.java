package com.example.demo.Common.service;

import java.net.*;

import org.apache.soap.rpc.Call;

import java.net.MalformedURLException;

public class SoapUtil {
    public static String getSoap(String soapUrl,String targetObjectURI,String methodName){
        URL url = null;
        try{
            url = new URL(soapUrl);
        }catch (MalformedURLException  e){
            return e.getMessage();
        }
        Call call = new Call();
        return null;
    }
}
