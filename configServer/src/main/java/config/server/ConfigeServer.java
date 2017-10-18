package config.server;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigeServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(ConfigeServer.class)
                .logStartupInfo(false)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run();

    }
}
