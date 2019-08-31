package text.utils;


import java.sql.SQLException;

/*
事务管理相关的工具类
包含了，开启，提交，回滚事务
以及释放连接
 */
public class TransactionManager {
    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    //开启事务
    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //提交事务
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //回滚事务
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //释放连接
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();//连接关掉还回连接池
            connectionUtils.removeConnection();//把连接和线程解绑，不接棒会造成线程还在，资源却没了
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
