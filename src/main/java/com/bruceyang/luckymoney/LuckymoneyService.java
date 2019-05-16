package com.bruceyang.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by yangxiaoge
 * 2019/5/16 14:35
 * 事务管理
 */
@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    //事务 ： 指数据库事务（mysql 引擎InnoDB 支持事务）
    //例如：购物时，  库存 > 订单 ， 要么都成功要么都失败
    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("小羊");
        luckymoney1.setMoney(new BigDecimal(520));
        repository.save(luckymoney1);
        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("小羊");
        luckymoney2.setMoney(new BigDecimal(1314));
        repository.save(luckymoney2);
    }
}
