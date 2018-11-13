package com.example.demo.Controller;

import com.example.demo.Dao.IUserInformationDao;
import com.example.demo.Service.FindUserInformationService;
import com.example.demo.Entity.UserInformationVo;
import com.example.demo.Common.Entity.ReturnResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/user")
public class FindUserInformationController {
    @Resource
    private FindUserInformationService findUserInformationService;
    @Autowired
    private IUserInformationDao iUserInformationDao;
    @RequestMapping("/findUser")
    public Set<UserInformationVo> findUserInformation(){
        List<UserInformationVo> list = findUserInformationService.findUserInformatin();
        //List<UserInformationVo> list1 = new  ArrayList<UserInformationVo>();
        Set<UserInformationVo> list1 = new HashSet<>(list);
        /*for(int i = 0;i<list.size();i++){
            if(!list1.contains(list.get(i))){
                System.out.println(list1);
                list1.add(list.get(i));

            }
        }*/
        return list1;
    }

    @RequestMapping(value = "/getUserInfo/{id}",method = RequestMethod.GET)
    public ReturnResultVo getUserInfo(@PathVariable("id") Long id){
        ReturnResultVo returnResultVo = new ReturnResultVo();
        List<UserInformationVo> list = new ArrayList<>();
        if(!id.equals("")){
            list = iUserInformationDao.getUserInformation(id);
        }
         returnResultVo.setData(list);
        return returnResultVo;
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteUserInformation(@PathVariable("id") Long id){
        return "";
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String test(){
        Integer i2 = 1;
        int ii = 1;
        Integer i = new Integer(1);
        Integer i1 = new Integer(1);
        System.out.println(i);
        System.out.println(i.intValue());
        System.out.println(i == i1);
        System.out.println(i.equals(i1));
        System.out.println(i==1);
        System.out.println(i.equals(i2));
        String s1 = new String("abc");
        String s = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s);
        System.out.println(s1 ==s2 );
        System.out.println(s==s2);
        System.out.println(s == s1.intern());
        System.out.println(s1==s2.intern());
        System.out.println(s1.intern() == s2.intern());
        System.out.println(s1.equals(s));
        System.out.println(s1 .equals(s2) );
        System.out.println(s.equals(s2));
        String a = "";
        if ((Object)ii instanceof Integer) {
             a ="aaa";
        }
        System.out.println(i2.equals(ii)+"--"+a);
        System.out.println(Objects.equals(i2,ii));
        return "";
    }
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public void insert(){
        UserInformationVo userInformationVo = new UserInformationVo();
        userInformationVo.setUserName("TEST");
        userInformationVo.setUserClass("1003");
        userInformationVo.setUserAddress("TEST");
        iUserInformationDao.insert(userInformationVo);
    }
  /*    @RequestMapping("/getSqlSession")
    public SqlSessionFactory getSession(){
        try{
            Reader reader = Resources.getResourceAsReader("resources/application.properties");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sqlSessionFactory;
    }
    @RequestMapping("/account")
    public Object account(HttpSession session) {
        Object obj = session.getAttribute("findUser");
        System.out.println(obj);
        return obj;
    }
  @RequestMapping("/getSessions")
    public List<UserInformationVo> getSessions(@ModelAttribute("findUser") List<UserInformationVo> list){
        List<UserInformationVo>list1 = new ArrayList<>();
        return list;
    }*/
}
