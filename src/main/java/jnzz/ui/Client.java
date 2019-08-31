package jnzz.ui;

import jnzz.service.ICarService;
import jnzz.service.impl.CarServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ICarService carService = beanFactory.getBean("carServiceImpl",CarServiceImpl.class);
        carService.saveCar();
        System.out.println(carService);
    }
}
