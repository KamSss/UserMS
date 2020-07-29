package userms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import userms.dto.User;
import userms.service.UserService;

import java.util.HashMap;
import java.util.List;

/**
 * @author ZHZ
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectById")
    public User select(@RequestParam(value = "id") Integer id){
        System.out.println("UserSelectById");
        return userService.selectById(id);
    }

    @GetMapping("/selectAll")
    public List<User> selectAll() {
        System.out.println("UserSelectAll");
        return userService.selectAll();
    }
}
