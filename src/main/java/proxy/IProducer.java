package proxy;

public interface IProducer {

    //卖出
    void saleProduct(float money);
    //提供售后
    void afterProduct(float money);
}
