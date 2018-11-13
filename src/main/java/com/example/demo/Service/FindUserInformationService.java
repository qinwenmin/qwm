package com.example.demo.Service;

import com.example.demo.Dao.IUserInformationDao;
import com.example.demo.Entity.UserInformationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindUserInformationService {
    @Autowired
    private IUserInformationDao IUserInformationDao;

    public List<UserInformationVo> findUserInformatin(){
        return IUserInformationDao.findUser();
    }
}
