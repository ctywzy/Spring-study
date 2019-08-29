package mjnxka.ui;

import mjnxka.dao.IAccountDao;
import mjnxka.dao.impl.AccountDaoImpl;
import mjnxka.factory.BeanFactory;
import mjnxka.service.IAccountService;
import mjnxka.service.impl.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
        AccountServiceImpl as;
        for(int i = 0;i<5;i++){
            as = (AccountServiceImpl) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }

//        IAccountService accountService;
//        System.out.println("kkkk");
//        accountService = (AccountServiceImpl) BeanFactory.getBean("accountService");
//        /*IAccountDao accountDao = (AccountDaoImpl)BeanFactory.getBean("accountDao");
//        System.out.println(accountDao);*/
//        //System.out.println(accountService);
//        accountService.saveAccount();
        //as.saveAccount();
    }
}
