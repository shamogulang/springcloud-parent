package cn.yishijie.ribbon.impl;

import cn.yishijie.ribbon.RibbonUserService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RibbonUserServiceImpl implements RibbonUserService {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Map<String, String> getUserInfo() {
        String url = "http://USER-SERVICE/v1/user";
        ResponseEntity<String> result =  restTemplate.getForEntity(url,String.class);
        String httpEntity = result.getBody();
        Map<String,String> resultMap = new HashMap<>();
        return resultMap;
    }
}
