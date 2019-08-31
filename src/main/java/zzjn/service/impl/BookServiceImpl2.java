package zzjn.service.impl;

import zzjn.service.IBookService;

import java.util.Date;

public class BookServiceImpl2 implements IBookService {
    private String name;
    private String age;
    private Date birthday;

    public void saveBook() {
        //System.out.println("对象已经创建");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "BookServiceImpl{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
