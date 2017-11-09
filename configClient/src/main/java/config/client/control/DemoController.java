package config.client.control;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shepard.xia
 * @date 2017年10月18日
 * @description input useage
 */
@RestController
public class DemoController implements ApplicationContextAware {
    @Value("${httpUrlPath}")
    String httpUrlPath;

    ApplicationContext context;

    @RequestMapping("/version")
    public String configVersion(){

        return String.format("{\"msg\":\"%s:%s\"}",context.getEnvironment().getProperty("httpUrlPath"),httpUrlPath);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context=applicationContext;
    }
}
