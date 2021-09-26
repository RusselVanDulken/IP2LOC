package com.example.IP.bean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;
/*
配置文件每一个值映射到这个组件
@ConfigurationProperties
prefix = "IP" 配置文件中那个下面的所有属性映射
 */
@Component
@ConfigurationProperties(prefix = "address")
public class Address {
    private String ret ;
    private String ip;
    Data Loc;

    @Override
    public String toString() {
        return "Address{" +
                "ret='" + ret + '\'' +
                ", ip='" + ip + '\'' +
                ", Loc=" + Loc +
                '}';
    }

    public Data getLoc() {
        return Loc;
    }

    public void setLoc(Data loc) {
        Loc = loc;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
