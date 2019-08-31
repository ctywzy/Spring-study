package mjnxka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("bean.xml");

        test1 t = beanFactory.getBean("aa",test1.class);
        System.out.println(t.getHello());
    }
}
