package mjnxka.service.impl;

import mjnxka.dao.IAccountDao;
import mjnxka.dao.impl.AccountDaoImpl;
import mjnxka.factory.BeanFactory;
import mjnxka.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = (AccountDaoImpl)BeanFactory.getBean("accountDao1");
    {
        //IAccountDao accountaa = (AccountDaoImpl)BeanFactory.getBean("accountDao");
        System.out.println("123"+accountDao);
    }
    private int i = 1;
    public void saveAccount() {
        //accountDao = (AccountDaoImpl)BeanFactory.getBean("accountDao");
        //System.out.println("456"+accountDao);
        accountDao.saveAccount();
        System.out.println(i++);
    }
}
