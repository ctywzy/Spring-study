package text.service;

import text.domain.Account;

import java.util.List;

public interface IAccountService {

    //查询所有
    List<Account> findAllAccount();
    //根据id查一个
    Account findAccountById(Integer accountId);
    //保存一个
    void saveAccount(Account account);
    //更新
    void updateAccount(Account account);
    //删除一个
    void deleteAccount(Integer accountId);
    //转账账户，收账账户，金额
    void transfer(String sourceName, String targetName, Float money);

}
