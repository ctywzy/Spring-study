package text.dao;

import text.domain.Account;

import java.util.List;

public interface IAccountDao {
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
    //根据名称查账户
    //单独一个返回，没有返回null，超过一个满足的抛异常
    Account findAccountByName(String accountName);
}
