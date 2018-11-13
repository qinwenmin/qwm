package com.example.demo.Controller;

import com.example.demo.Common.service.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestRestMethod {
    @Autowired
    private RestUtil restUtil;
    @RequestMapping("/getTest")
    public String getTest(){
        String url = "https://www.cnblogs.com/mvc/Blog/GetBlogSideBlocks.aspx?blogApp=hugos&showFlag=ShowRecentComment%2CShowTopViewPosts%2CShowTopFeedbackPosts%2CShowTopDiggPosts";
        String returnStr = "";
        try {
            returnStr = restUtil.getMethod(url);

        }catch (Exception e){
            System.out.println(e.getMessage());
            returnStr = e.getMessage();
        }
        System.out.println(returnStr);
        return returnStr;
    }
    @RequestMapping("/postTest")
    public String postTest(){
        String returnStr = "";
        String url = "https://in.hotjar.com/api/v1/client/sites/646199/visit-data?sv=5";
        String params = "{\"window_width\":1366,\"window_height\":188,\"included_in_sample\":true,\"fingerprint\":\"636923cd31e22009e544751c65af8476\",\"insert_traffic_log_entry\":true,\"suppress_location\":false,\"url\":\"https://www.getpostman.com/apps\"}";
        try {
            returnStr = restUtil.postMethed(url,params);

        }catch (Exception e){
            System.out.println(e.getMessage());
            returnStr = e.getMessage();
        }
        return returnStr;
    }
}
