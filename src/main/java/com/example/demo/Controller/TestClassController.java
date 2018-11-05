package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RequestMapping("/test")
@RestController
public class TestClassController {
    @RequestMapping("/sortArray")
    public String sortArray(){
        int[] a = {2,1,3,4,44,10,9};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        int[] b = a;
        System.out.println(Arrays.toString(a));
        return Arrays.toString(a);
    }
    @RequestMapping("/testSort2")
    public String testSort2(){
        int[] a = {2,1,3,4,44,10,9};
        for(int i = 0;i<a.length-1;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return Arrays.toString(a);
    }
    @RequestMapping("/copyFile")
    public void copyFile(){
        try{
            FileWriter fileWriter = new FileWriter("D://copy_a.txt");
            FileReader fileReader = new FileReader("D://a.txt");
            int num = 0;
            while((num=fileReader.read())!=-1){
                fileWriter.write(num);
            }
            fileReader.close();
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @RequestMapping("/mapFor")
    public String MapFor(){
        Map<Object,Object> map = new HashMap<>();
        map.put("a","abc");
        map.put("b","bcd");
        map.put("c","cde");
        Object map1 = ((HashMap<Object, Object>) map).clone();
        System.out.println(map1);
        for(Map.Entry<Object,Object> entry:map.entrySet()){
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key:"+key+"  value:"+value);
        }
        return "ok";
    }
}
