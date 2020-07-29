package userms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userms.dto.Role;
import userms.dto.User;
import userms.mapper.RoleMapper;

import java.util.List;

/**
 * @author ZHZ
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role selectById(Integer r_id) {
        return roleMapper.selectById(r_id);
    }

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }

}
