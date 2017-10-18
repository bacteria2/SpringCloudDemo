package feign.serve;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignServe {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(FeignServe.class)
                .logStartupInfo(false)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run();

    }
}
