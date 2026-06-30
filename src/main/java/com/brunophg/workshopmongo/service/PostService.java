package com.brunophg.workshopmongo.service;

import com.brunophg.workshopmongo.domain.Post;
import com.brunophg.workshopmongo.domain.User;
import com.brunophg.workshopmongo.dto.UserDTO;
import com.brunophg.workshopmongo.repository.PostRepository;
import com.brunophg.workshopmongo.repository.UserRepository;
import com.brunophg.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
