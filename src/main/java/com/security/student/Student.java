package com.security.student;

public class Student {
    private String name;
    private String msg;
    private String mail;
    private String me;

    public Student(){}

    public Student(String name, String msg, String mail, String me) {
        this.name = name;
        this.msg = msg;
        this.mail = mail;
        this.me = me;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMe(String me) {
        this.me = me;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String getMail() {
        return mail;
    }

    public String getMe() {
        return me;
    }
}
