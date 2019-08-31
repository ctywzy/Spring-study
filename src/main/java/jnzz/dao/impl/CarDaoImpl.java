package jnzz.dao.impl;

import jnzz.dao.ICarDao;
import org.springframework.stereotype.Repository;

//这里id乱写也是可以的，一定条件下，因为它是按照类型匹配的。
@Repository("casfasfssssssssssssssrDao")
public class CarDaoImpl implements ICarDao {
    public void buycar() {
        System.out.println("买车");
    }
}
