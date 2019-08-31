package text.ui;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import text.domain.Account;
import text.service.IAccountService;
import text.service.impl.AccountServiceImpl;

import java.util.List;

public class AccountServiceTest {
    ApplicationContext beanFactory;
    IAccountService accountService;
    {
        beanFactory = new ClassPathXmlApplicationContext("bean.xml");
        accountService = beanFactory.getBean("accountService", AccountServiceImpl.class);
    }


    @Test
    public void testFindAll(){
        List<Account> list = accountService.findAllAccount();
        System.out.println(list.toString());
    }

    @Test
    public void testFindOne(){
        Account account = accountService.findAccountById(2);
        System.out.println(account.toString());
    }

    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("mjn");
        account.setMoney((float) 123);
        accountService.saveAccount(account);
        testFindAll();
    }

    @Test
    public void testUpdate(){
        Account account = accountService.findAccountById(4);
        System.out.println(account);
        account.setMoney((float) 123456);
        accountService.updateAccount(account);
        System.out.println(accountService.findAccountById(4));
    }

    @Test
    public void testDelete(){
        accountService.deleteAccount(1);
        testFindAll();
    }
}
