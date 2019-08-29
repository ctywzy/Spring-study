package mjnxka.service.impl;

import mjnxka.dao.IAccountDao;
import mjnxka.dao.impl.AccountDaoImpl;
import mjnxka.factory.BeanFactory;
import mjnxka.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private int i=1;
    private IAccountDao AccountDao = (AccountDaoImpl)BeanFactory.getBean("accountDao");
    public void saveAccount() {
        AccountDao.saveAccount();
        System.out.println(i);
    }
}
