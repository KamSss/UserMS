package userms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import userms.dto.UserRole;
import userms.service.UserRoleService;

import java.util.List;

/**
 * @author ZHZ
 */
@RestController
@RequestMapping("/UserRole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("/selectAll")
    public List<UserRole> selectUserRoleAll(){
        System.out.println("UserRoleSelectAll");
        return userRoleService.selectUserRoleAll();
    }
}
