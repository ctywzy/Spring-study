package text.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import text.dao.IAccountDao;
import text.dao.impl.AccountDaoImpl;
import text.domain.Account;
import text.service.IAccountService;
import text.utils.TransactionManager;

import java.util.List;
import java.util.regex.Pattern;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        //然后我们用事务来操作他们
        try{
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            List<Account> list = accountDao.findAllAccount();
            //提交事务
            transactionManager.commit();
            //返回结果
            return list;
        }catch (Exception e) {
            //出异常回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //不管怎样都释放资源
            transactionManager.release();

        }

    }

    public Account findAccountById(Integer accountId) {
        //然后我们用事务来操作他们
        try{
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            Account account = accountDao.findAccountById(accountId);
            //提交事务
            transactionManager.commit();
            //返回结果
            return account;
        }catch (Exception e) {
            //出异常回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //不管怎样都释放资源
            transactionManager.release();
        }
    }

    public void saveAccount(Account account) {
        //然后我们用事务来操作他们
        try{
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            accountDao.saveAccount(account);
            //提交事务
            transactionManager.commit();
            //返回结果
        }catch (Exception e) {
            //出异常回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //不管怎样都释放资源
            transactionManager.release();
        }
    }

    public void updateAccount(Account account) {
        //然后我们用事务来操作他们
        try{
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            accountDao.updateAccount(account);
            //提交事务
            transactionManager.commit();
            //返回结果
        }catch (Exception e) {
            //出异常回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //不管怎样都释放资源
            transactionManager.release();
        }
    }

    public void deleteAccount(Integer accountId) {
        try{
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            accountDao.deleteAccount(accountId);
            //提交事务
            transactionManager.commit();
            //返回结果
        }catch (Exception e) {
            //出异常回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //不管怎样都释放资源
            transactionManager.release();
        }

    }

    public void transfer(String sourceName, String targetName, Float money) {
        /*
        这就是一串事务了
        1.更具名称查询转出账户
        2.更具名称查询过转入账户
        3.转出账户减钱
        4.转入账户加钱
        5.转出账户更新
        5.转入账户更新
         */
        try{
            transactionManager.beginTransaction();

            Account sourceAccount = accountDao.findAccountByName(sourceName);
            Account targetAccount = accountDao.findAccountByName(targetName);
            sourceAccount.setMoney(sourceAccount.getMoney()-money);
            //System.out.println(1/0);
            targetAccount.setMoney(targetAccount.getMoney()+money);
            accountDao.updateAccount(sourceAccount);
            accountDao.updateAccount(targetAccount);

            transactionManager.commit();
        }catch (Exception e){
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            transactionManager.release();
        }

    }
}
