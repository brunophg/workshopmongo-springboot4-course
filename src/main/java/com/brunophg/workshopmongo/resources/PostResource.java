
package com.brunophg.workshopmongo.resources;

import com.brunophg.workshopmongo.domain.Post;
import com.brunophg.workshopmongo.domain.User;
import com.brunophg.workshopmongo.dto.UserDTO;
import com.brunophg.workshopmongo.service.PostService;
import com.brunophg.workshopmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class PostResource {

    @Autowired
    private PostService service;


    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
