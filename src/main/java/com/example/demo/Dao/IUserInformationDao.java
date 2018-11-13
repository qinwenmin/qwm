package com.example.demo.Dao;

import com.example.demo.Entity.UserInformationVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface IUserInformationDao {
    public List<UserInformationVo> findUser();
    public List<UserInformationVo> getUserInformation(Long id);
    public void insert(UserInformationVo userInformationVo);

}
