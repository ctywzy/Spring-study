package jnzz.dao.impl;

import jnzz.dao.ICarDao;
import org.springframework.stereotype.Repository;

@Repository("carDao")
public class CarDaoImpl implements ICarDao {
    public void buycar() {
        System.out.println("买车");
    }
}
