package zuul.proxy;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulProxyMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .logStartupInfo(false)
                .sources(ZuulProxyMain.class)
                .run(args);
    }
}
