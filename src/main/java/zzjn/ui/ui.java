package zzjn.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zzjn.service.IBookService;
import zzjn.service.impl.BookServiceImpl;
import zzjn.service.impl.BookServiceImpl2;

import java.util.HashMap;

public class ui {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IBookService bookService = beanFactory.getBean("bookService2", BookServiceImpl2.class);
        System.out.println(bookService);
    }
}
