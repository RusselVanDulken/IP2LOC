package com.example.IP.controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.IP.bean.Address;
import com.example.IP.bean.Data;
import com.example.IP.utils.AddressUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/get")
@Controller
/*
@RestController
@Controller+@ResponseBody
 */
public class InputController {
        @GetMapping("/ch")
        public String ch() {return "check.html";}

        @PostMapping("/check")
        @ResponseBody
        public Map<String, Object> check(@RequestParam("ip") String ip) throws Exception{
                /*
                AddressUtils addressUtils = new AddressUtils();
                String address = "";
                try {
                        address = addressUtils.getAddresses("ip=" + ip, "utf-8");
                }
                 */
                String address = "";
                try {
                        address = AddressUtils.getAddresses("ip=" + ip, "utf-8");
                }
                catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                }
                JSONObject jsonObject = JSONObject.parseObject(address);
                //获取JSONArry  DATA
                JSONArray jsonarry = jsonObject.getJSONArray("data");
                System.out.println(jsonarry);
                Data i = new Data();
                i.setCountry(jsonarry.getString(0));
                i.setRegion(jsonarry.getString(1));//省份
                i.setCity(jsonarry.getString(2));//城市
                i.setDistrict(jsonarry.getString(3));//区县
                i.setTelecom(jsonarry.getString(4));//运营商
                i.setZip(jsonarry.getString(5));//
                i.setZone (jsonarry.getString(6));//
                System.out.println("获取的地址为：" + address);
                System.out.println ("解析得到的地址为：" +i.toString()) ;
                String result = i.toString();
                Map<String,Object> map = new HashMap<>();
                map.put("data",result);
                return map;
        }
}


