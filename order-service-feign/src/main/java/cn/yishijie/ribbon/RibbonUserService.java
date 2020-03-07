package cn.yishijie.ribbon;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "USER-SERVICE")
public interface RibbonUserService {

    @RequestMapping(value = "/v1/user",method = RequestMethod.GET)
    Map<String,String> getUserInfoFeign();
}
