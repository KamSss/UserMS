package userms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import userms.dto.Role;
import userms.dto.User;
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

    @PostMapping("/selectAll")
    public List<UserRole> selectUserRoleAll(@RequestBody UserRole userRole){
        System.out.println("UserRoleSelectAll");
        return userRoleService.selectUserRoleAll(userRole.getPageNum(),userRole.getPageSize());
    }

    @PostMapping("/selectTest")
    public List<UserRole> selectTest(@RequestBody UserRole userRole){
        System.out.println("selectRoleTest");
        return userRoleService.selectRoleTest(userRole.getPageNum(),userRole.getPageSize());
    }

    @PostMapping("/giveRole")
    public List<UserRole> distributionRole(@RequestBody UserRole userRole){
        System.out.println("distributionRole");
        userRoleService.distributionRole(userRole);
        return userRoleService.selectUserRoleAll(userRole.getPageNum(),userRole.getPageSize());
    }
}
