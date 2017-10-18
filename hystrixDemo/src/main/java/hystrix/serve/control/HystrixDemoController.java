package hystrix.serve.control;

import hystrix.serve.service.HystrixRibbonService;
import hystrix.serve.service.IHystrixFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@RestController
public class HystrixDemoController {
    @Autowired
    HystrixRibbonService service;

    @Autowired
    IHystrixFeignService feignService;


    @RequestMapping("/ribbon/hello")
    public String ribbon(@RequestParam(required = false)String name){
        return service.hello(name);
    }


    @RequestMapping("/feign/hello")
    public String feign(@RequestParam(required = false)String name){
        return feignService.feignHello(name);
    }

}
