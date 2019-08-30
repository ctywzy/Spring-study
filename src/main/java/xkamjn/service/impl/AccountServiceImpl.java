package xkamjn.service.impl;

import xkamjn.dao.IAccountDao;
import xkamjn.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    IAccountDao accountDao;
    public AccountServiceImpl(){
        System.out.println("创建对象");
    }
    public void saveAccount() {

    }
}
