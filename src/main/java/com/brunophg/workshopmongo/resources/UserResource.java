package com.brunophg.workshopmongo.resources;

import com.brunophg.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User user1 = new User("1001", "Maria Silva", "maria@gmail.com");
        User user2 = new User("1002", "Alex Silva", "alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(user1, user2));
        return ResponseEntity.ok().body(list);
    }
}
