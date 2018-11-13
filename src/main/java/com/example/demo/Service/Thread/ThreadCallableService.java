package com.example.demo.Service.Thread;

import com.alibaba.druid.support.json.JSONUtils;
import com.example.demo.Dao.IUserInformationDao;
import com.example.demo.Entity.UserInformationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;
import java.util.List;
@Service
public class ThreadCallableService implements Callable {
    @Autowired
    private IUserInformationDao iUserInformationDao;
    @Override
    public Object call() throws Exception {
        List<UserInformationVo> list = iUserInformationDao.findUser();
        System.out.println(JSONUtils.toJSONString(list));
        Object obj = JSONUtils.toJSONString(list);
        return obj;
    }
}
