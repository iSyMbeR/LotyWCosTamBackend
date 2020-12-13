package com.lotywkosmos.lotywkosmos.Service;

import com.lotywkosmos.lotywkosmos.Model.User;
import com.lotywkosmos.lotywkosmos.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;//injection

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getSingleUser(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}
