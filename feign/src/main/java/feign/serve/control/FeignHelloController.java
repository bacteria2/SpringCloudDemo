package feign.serve.control;

import feign.serve.service.IFeignHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@RestController
public class FeignHelloController {
    @Autowired
    IFeignHiService hiService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(required = false) String name){
        return hiService.sayHiFromClientOne(name);
    }
}
