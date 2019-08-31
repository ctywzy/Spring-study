package zzjn.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zzjn.service.IBookService;
import zzjn.service.impl.Complex;

public class ui2 {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IBookService complex = beanFactory.getBean("complex", Complex.class);
        complex.saveBook();
    }
}
