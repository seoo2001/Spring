package practice.todo.controller;

import org.springframework.web.bind.annotation.*;
import practice.todo.domain.MemberDTO;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {
    @PostMapping("/test")
    public String postTest() {
        return "Hello Test";
    }
    @GetMapping("/test")
    public String getTest() {
        return "Hello Test";
    }
    @GetMapping("/var-test/{variable}")
    public String getVariable(@PathVariable("variable") String var) {
        return var;
    }
    @GetMapping("/param-test")
    public String getRequestParam(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }
    @GetMapping("/param-test2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey()+": "+map.getValue()+"\n");
        });
        return sb.toString();
    }
    @GetMapping("/dto-test")
    public String GetRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
