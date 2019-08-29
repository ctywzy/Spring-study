package mjnxka.factory;

import javax.swing.text.Element;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
创建bean工厂
bean-->计算机语言中有可重用组件的意思
先用配置文件来配置service和dao
在读取配置文件，通过反射创建对象

配置文件一般是properties 用load加载，write存贮
或者是xml
 */
public class BeanFactory {
    private static Properties props;
    private static Map<String,Object> beans;
    //直接使用静态代码块实例化对象
    static {
        props = new Properties();
        try {
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            //System.out.println(in);
            props.load(in);

            beans = new HashMap<String, Object>();
            Enumeration el = props.keys();


            while(el.hasMoreElements()){
                String key = el.nextElement().toString();
                //System.out.println(key);
                String beanPath = props.getProperty(key);
                //System.out.println(beanPath);
                Object obj = Class.forName(beanPath).newInstance();
                beans.put(key,obj);
            }

        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties异常");
        }
    }
    /*
    根据名称获取内容
    满足有配置文件
    通过配置文件反射获取对象
     */
    public static Object getBean(String beanName){
        //System.out.println(beans);
        return beans.get(beanName);
    }
}
