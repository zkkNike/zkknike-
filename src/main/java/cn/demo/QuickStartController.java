package cn.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2(){
        return "springBoot 访问成功2";
    }
}
