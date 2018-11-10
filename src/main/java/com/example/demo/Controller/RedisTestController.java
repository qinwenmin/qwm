package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/redis")
public class RedisTestController {
    Jedis jedis = new Jedis();
    @RequestMapping("/save")
    public void save(){
        Map<String,String> map = new HashMap<>();
        map.put("a","b");
        map.put("b","b");
        jedis.set("name","zhangsan");
        jedis.hmset("map",map);
        System.out.println(jedis.get("a"));
        System.out.println(jedis.get("name"));
    }
    @RequestMapping("/delete/{key}")
    public String delete(@PathVariable("key") String key){
        String returnStr = "fail";
        String value = "";
        value = jedis.get(key);
        System.out.println(value);
        if(value!=null){
            jedis.del(key);
            returnStr = "succes";
        }
        return returnStr;
    }
}
