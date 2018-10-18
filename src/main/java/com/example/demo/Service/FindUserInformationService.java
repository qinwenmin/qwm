package com.example.demo.Service;

import com.example.demo.Dao.FindUserInformationDao;
import com.example.demo.Vo.UserInformationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindUserInformationService {
    @Autowired
    private FindUserInformationDao FindUserInformationDao;

    public List<UserInformationVo> findUserInformatin(){
        return FindUserInformationDao.findUser();
    }
}
