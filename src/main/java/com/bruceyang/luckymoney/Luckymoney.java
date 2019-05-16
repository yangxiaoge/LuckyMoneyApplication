package com.bruceyang.luckymoney;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by yangxiaoge
 * 2019/5/14 16:49
 */
@Entity
public class Luckymoney {
    public Luckymoney() {
    }

    @Id
    @GeneratedValue
    private Integer id;
    private BigDecimal money;
    /**
     * 发送方
     */
    private String producer;
    /**
     * 接收方
     */
    private String comsumer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getComsumer() {
        return comsumer;
    }

    public void setComsumer(String comsumer) {
        this.comsumer = comsumer;
    }
}
