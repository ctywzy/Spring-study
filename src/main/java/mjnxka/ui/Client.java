package mjnxka.ui;

import mjnxka.dao.IAccountDao;
import mjnxka.factory.BeanFactory;
import mjnxka.service.IAccountService;
import mjnxka.service.impl.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
        IAccountService as;
        /*for(int i = 0;i<5;i++){
            as = (AccountServiceImpl) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }
         */
        BeanFactory beans = new BeanFactory();
        IAccountService accountService = (AccountServiceImpl)beans.getBean("accountService");
        //as.saveAccount();
    }
}
