package hystrix.serve.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */

@FeignClient(value = "service-hi",fallback = HystrixFeignService.class)
public interface IHystrixFeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String feignHello(@RequestParam(value = "name")String name);

}
