package cglib;


public class Producer{
    public void saleProduct(float money) {
        System.out.println("卖出产品获得钱 ："+money);
    }

    public void afterProduct(float money) {
        System.out.println("提供售后获得钱 ："+money);
    }
}
