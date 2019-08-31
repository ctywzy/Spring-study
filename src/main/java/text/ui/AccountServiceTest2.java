package text.ui;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import text.dao.IAccountDao;
import text.dao.impl.AccountDaoImpl;
import text.service.IAccountService;
import text.service.impl.AccountServiceImpl;

public class AccountServiceTest2 {

    @Test
    public void tranferTest(){
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = beanFactory.getBean("accountService", AccountServiceImpl.class);
        accountService.transfer("bbb","ccc", (float) 500);
    }
}
