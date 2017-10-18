package hystrix.serve.service;

import org.springframework.stereotype.Component;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@Component
public class HystrixFeignService implements IHystrixFeignService  {
    @Override
    public String feignHello(String name) {
        return "{\"msg\":\"feign client  is  unavailable for now\",\"code\":500}";
    }
}
