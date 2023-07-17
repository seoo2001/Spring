package practice.todo.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import practice.todo.domain.Member;

@Service
public class MongoService {

    private final MongoTemplate mongoTemplate;
    private static Long sequence = 0L;

    public MongoService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void mongoInsert(String name, String password) {
        Member member = new Member();
        member.setId(++sequence);
        member.setPassword(password);
        member.setName(name);
        mongoTemplate.insert(member);
    }
}
