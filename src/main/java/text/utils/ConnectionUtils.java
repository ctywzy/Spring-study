package text.utils;

import javax.sql.DataSource;
import java.sql.Connection;

/*
数据库连接类，保证事务的一致性
用于从数据源中获取一个连接，并且实现线程的绑定
 */
public class ConnectionUtils {
    private  ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection(){
        //先从THreadLocal上获取
        Connection conn = tl.get();
        try{
            //判断当前是否有连接
            if(conn == null){
                //从数据源中获取连接
                conn = dataSource.getConnection();

                tl.set(conn);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    //解绑线程和连接，否则线程在，连接资源被关了
    //那也是没有,调用release回关闭资源，把资源放回池中，但不会释放线程
    public void removeConnection(){
        tl.remove();
    }







}
