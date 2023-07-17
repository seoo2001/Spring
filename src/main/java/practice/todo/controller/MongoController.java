package practice.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice.todo.domain.Member;
import practice.todo.service.MongoService;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class MongoController {

    private final MongoService mongoService;

    @Autowired
    public MongoController(MongoService mongoService) {this.mongoService = mongoService;}


    @PostMapping("/member")
    @CrossOrigin(origins = "http://localhost:3030")
    public String saveMember(@RequestBody Map<String, Object> param) throws Exception {
        mongoService.mongoInsert((String)param.get("username"), (String)param.get("password"));
        return "success";
    }


}
