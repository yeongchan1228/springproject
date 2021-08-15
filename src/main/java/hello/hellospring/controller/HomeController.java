package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/") // localhost:8080/ 처음 들어갔을 때 뜨는 홈페이지
    @ResponseBody
    public String home(){
        return "home";
    }


}
