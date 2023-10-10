package br.com.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @PostMapping(value = "/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}