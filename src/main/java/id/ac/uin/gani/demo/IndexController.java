package id.ac.uin.gani.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("/hello")
    public String index(){
        return "Selamat belajar Spring Boot!";
    }
}
