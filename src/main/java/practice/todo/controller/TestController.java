package practice.todo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/put-test-string")
    public String putMethod1(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    @PutMapping("/put-test-dto")
    public MemberDTO putMethod2(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    @PutMapping("/put-test-response-entity")
    public ResponseEntity<MemberDTO> putMethod3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }


}
