package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Un Amico
 * @date 2020/5/3 -9:30
 */
@Controller
public class IndexController {
    @GetMapping("/")
     public String index(){
     return "index";
    }

}
