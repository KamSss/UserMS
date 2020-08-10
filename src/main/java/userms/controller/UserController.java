package userms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import userms.dto.PagingParam;
import userms.dto.User;
import userms.service.UserService;

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

    @PostMapping("/selectAll")
    public List<User> selectAll(@RequestBody User user) {
        System.out.println("UserSelectAll");
        return userService.selectAll(user.getPageNum(),user.getPageSize());
    }

    @GetMapping("/deleteById")
    public List<User> deleteById(@RequestParam(value = "id") Integer id){
        System.out.println("deleteById");
        userService.deleteById(id);
        return userService.selectAll(1,5);
    }

    @PostMapping("/insert")
    public List<User> insertUser(@RequestBody User user){
        System.out.println("insertUser");
        userService.insertUser(user);
        return userService.selectAll(user.getPageNum(),user.getPageSize());
    }

    @PostMapping("/update")
    public List<User> updateUser(@RequestBody User user){
        System.out.println("updateUser");
        userService.updateUser(user);
        return userService.selectAll(user.getPageNum(),user.getPageSize());
    }


}
