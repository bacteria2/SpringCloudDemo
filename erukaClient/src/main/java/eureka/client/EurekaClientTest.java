package eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */

@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaClientTest {


    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(EurekaClientTest.class)
                .logStartupInfo(false)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run();

    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String helloWorld(@RequestParam(required = false) String name){
        return String.format("{\"msg\":\"hello %s,this is from %s\"}"
                ,Optional.ofNullable(name).orElse("default")
                ,port);
    }
}
