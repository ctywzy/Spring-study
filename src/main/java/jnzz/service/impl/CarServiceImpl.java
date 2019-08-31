package jnzz.service.impl;

import jnzz.dao.ICarDao;
import jnzz.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private ICarDao carDao;

    public void saveCar() {
        carDao.buycar();
    }
}
