package com.lotywkosmos.lotywkosmos.Service;

import com.lotywkosmos.lotywkosmos.Model.User;
import com.lotywkosmos.lotywkosmos.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private static final int PAGE_SIZE = 30;
    private final UserRepository userRepository;//injection

    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public Page<User> getUsersWithSorting(int page, Sort.Direction sort){
        return userRepository.findAll(PageRequest.of(page, PAGE_SIZE,
                Sort.by(sort,"id")));
    }
    public User getSingleUser(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserByLoginAndPassword(String login, String password){
        return userRepository.getByLoginAndPassword(login,password);
    }
}
