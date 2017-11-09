package config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shepard.xia
 * @date 2017年10月18日
 * @description input useage
 */
@SpringBootApplication
public class ConfigClientDemo {
    public static void main(String[] args) {
     /*   new SpringApplicationBuilder()
                .sources(ConfigClientDemo.class)
                .logStartupInfo(false)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run(args);*/
        SpringApplication.run(ConfigClientDemo.class, args);
    }


}
