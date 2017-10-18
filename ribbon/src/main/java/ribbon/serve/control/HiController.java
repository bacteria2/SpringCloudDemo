package ribbon.serve.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ribbon.serve.service.HiService;

/**
 * @author shepard.xia
 * @date 2017年10月17日
 * @description input useage
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;


    @RequestMapping("/hello")
    public String hello(@RequestParam(required = false) String name){
        return hiService.hiService(name);
    }
}
