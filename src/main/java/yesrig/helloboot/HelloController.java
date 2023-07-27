package yesrig.helloboot;

public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String hello(String name) {
        if (name == null) { //Object.requireNonNull() 안돼서 if, else로 대체
            return "Object is null";
        } else {
            return helloService.sayHello(name);
        }
    }
}
