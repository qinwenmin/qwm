package com.example.demo.common.vo;

public class ReturnResultVo {
    private int statusCode;
    private String message;
    private Object data;

    public ReturnResultVo(int statusCode,String message,Object data){
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }
    public ReturnResultVo(Object data){
        this.statusCode = 200;
        this.message = "SUCCES";
        this.data = data;
    }
    public ReturnResultVo(){
        this.statusCode = 200;
        this.message = "SUCCES";
    }
    public ReturnResultVo(int statusCode,String message){
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatus() {
        return statusCode;
    }

    public void setStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
