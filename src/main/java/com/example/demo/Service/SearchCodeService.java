package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class SearchCodeService {
    private static SearchCodeService singletonHungary = new SearchCodeService();
    private SearchCodeService(){}
    public static  SearchCodeService getInstance(){
        return singletonHungary;
    }

    public String getString(){
        return "ok";
    }
}
