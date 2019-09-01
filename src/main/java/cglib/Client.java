package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.IProducer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        final Producer producer = new Producer();

        Producer enhancerProducer= (Producer) Enhancer.create(producer.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object returnValue = null;

                Float money = (Float) objects[0];

                if("saleProduct".equals(method.getName())){
                    returnValue = method.invoke(producer,money*0.8f);
                }
                return returnValue;
            }
        });

        enhancerProducer.saleProduct(12000f);
    }
}
