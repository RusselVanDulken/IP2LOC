package com.example.IP;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.IP.bean.Address;
import com.example.IP.utils.AddressUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
@RunWith(SpringRunner.class)
@SpringBootTest
class IpApplicationTests {

	@Autowired
	Address address;

	@Test
	public void contextLoads() {
          System.out.println(address);
	}
}

