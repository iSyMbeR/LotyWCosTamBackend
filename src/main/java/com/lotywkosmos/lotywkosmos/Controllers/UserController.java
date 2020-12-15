package com.lotywkosmos.lotywkosmos.Controllers;

import com.lotywkosmos.lotywkosmos.Model.User;
import com.lotywkosmos.lotywkosmos.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
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

}
