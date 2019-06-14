package servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: GH
 * @Date: 2019/3/30 19:10
 * @Version 1.0
 */

@Controller
public class Test {

    @RequestMapping("/test")
    public String test() {
        String url = "test.jsp";
        return url;
    }

}
