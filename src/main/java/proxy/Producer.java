package proxy;

public class Producer implements IProducer{
    public void saleProduct(float money) {
        System.out.println("卖出产品获得钱 ："+money);
    }

    public void afterProduct(float money) {
        System.out.println("提供售后获得钱 ："+money);
    }
}
