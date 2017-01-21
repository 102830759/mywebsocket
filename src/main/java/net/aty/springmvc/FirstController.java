package net.aty.springmvc;

import net.aty.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/1/21.
 */
@Controller
public class FirstController {

    @Autowired
    private MyService service;

    public FirstController()
    {
        System.out.println("I am a controller.");
    }

    @RequestMapping("/mvc/first/hello.do")
    @ResponseBody
    public String hello(@RequestParam("userName") String userName) {
        return service.process(userName);
    }

}
