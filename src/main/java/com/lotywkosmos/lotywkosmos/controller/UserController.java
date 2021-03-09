package com.lotywkosmos.lotywkosmos.controller;

import com.lotywkosmos.lotywkosmos.model.User;
import com.lotywkosmos.lotywkosmos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {


    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/users/{page}/{sort}")
    public Page<User> getUsersWithSorting(@PathVariable int page, @PathVariable Sort.Direction sort){
        return userService.getUsersWithSorting(page, sort);
    }

    @GetMapping("/users/{id}")
    public User getSingleUser(@PathVariable long id) {
        return userService.getSingleUser(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/users/search/{login}/{password}")
    public User getUserByLoginAndPassword(@PathVariable String login, @PathVariable String password){
        return userService.getUserByLoginAndPassword(login, password);
    }
}
