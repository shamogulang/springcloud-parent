package cn.yishijie.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/v1")
@Controller
public class UserController {

    @RequestMapping(value = "/user")
    public ResponseEntity<?> getUserInfo(){
        Map<String,String> userInfoMap = new HashMap<>();
        userInfoMap.put("name","caraliu");
        userInfoMap.put("age","18");
        userInfoMap.put("desc","beauty");
        return new ResponseEntity<>(userInfoMap, HttpStatus.OK);
    }
}
