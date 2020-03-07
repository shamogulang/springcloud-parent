package cn.yishijie.controller.v1;

import cn.yishijie.ribbon.RibbonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/v1")
public class OrderController {


    @Autowired
    private RibbonUserService ribbonUserService;
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public ResponseEntity<?> getOrder(){
        Map<String,String> resultMap = ribbonUserService.getUserInfoFeign();
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }
}
