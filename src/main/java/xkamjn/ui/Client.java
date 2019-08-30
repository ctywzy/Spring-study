package xkamjn.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xkamjn.service.IAccountService;
import xkamjn.service.impl.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
        /**
         * 获取spring的Ioc核心容器，并更具id获取对象
         */
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("123");
        IAccountService accountService = beanFactory.getBean("accountService", AccountServiceImpl.class);
        //System.out.println(accountService);
    }
}
