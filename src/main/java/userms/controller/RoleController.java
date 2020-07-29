package userms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import userms.dto.Role;
import userms.service.RoleService;

import java.util.List;

/**
 * @author ZHZ
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/selectById")
    public Role selectById(@RequestParam(value = "id") Integer id){
        System.out.println("RoleSelectById");
        return roleService.selectById(id);
    }

    @GetMapping("/selectAll")
    public List<Role> selectAll(){
        System.out.println("RoleSelectAll");
        return roleService.selectAll();
    }
}
