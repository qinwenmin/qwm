package com.example.demo.Controller;

import com.example.demo.Service.FindUserInformationService;
import com.example.demo.Vo.UserInformationVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class FindUserInformationController {
    @Resource
    private FindUserInformationService findUserInformationService;
    @RequestMapping("/findUser")
    public List<UserInformationVo> findUserInformation(){
        return findUserInformationService.findUserInformatin();
    }
}
