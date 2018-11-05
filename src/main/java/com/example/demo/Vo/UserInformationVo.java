package com.example.demo.Vo;

import java.util.Objects;

public class UserInformationVo {
    //private Long userId;
    private String userName;
    private String userClass;
    private String userAddress;

   // public Long getUserId() {
   //     return userId;
  //  }

   // public void setUserId(Long userId) {
     //   this.userId = userId;
   // }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInformationVo)) return false;
        UserInformationVo that = (UserInformationVo) o;
        return Objects.equals(getUserName(), that.getUserName()) &&
                Objects.equals(getUserClass(), that.getUserClass()) &&
                Objects.equals(getUserAddress(), that.getUserAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getUserClass(), getUserAddress());
    }
}
