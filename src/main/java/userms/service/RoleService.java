package userms.service;

import org.springframework.stereotype.Service;
import userms.dto.Role;
import userms.dto.User;

import java.util.List;

/**
 * @author ZHZ
 */
public interface RoleService {
    Role selectById(Integer r_id);
    List<Role> selectAll(Integer pageNum,Integer pageSize);
}
