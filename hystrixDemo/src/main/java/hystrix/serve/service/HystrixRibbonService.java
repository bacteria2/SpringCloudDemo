package hystrix.serve.service;

import com.google.common.base.Strings;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@Service
public class HystrixRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "onError")
    public String hello(String name){
        String param= !Strings.isNullOrEmpty(name)?"?name="+name:"";
        return restTemplate.getForObject("http://SERVICE-HI/hi"+param,String.class);
    }

    public String onError(String name){
        return "{\"msg\":\"ribbon client is  unavailable for now\",\"code\":500}";
    }

}
