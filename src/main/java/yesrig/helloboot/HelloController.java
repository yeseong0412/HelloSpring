package yesrig.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hello")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    @ResponseBody
    public String hello(String name) {
        if (name == null) { //Object.requireNonNull() 안돼서 if, else로 대체
            return "Object is null";
        } else {
            return helloService.sayHello(name);
        }
    }
}
