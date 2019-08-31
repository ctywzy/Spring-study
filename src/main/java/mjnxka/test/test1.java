package mjnxka.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aa")
public class test1 {
    @Value("123")
    private int hello;

    public void setHello(int hello) {
        this.hello = hello;
    }

    public int getHello() {
        return hello;
    }
}
