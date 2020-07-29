package userms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userms.dto.UserRole;
import userms.mapper.UserRoleMapper;

import java.util.List;

/**
 * @author ZHZ
 */
@Service
public class UserRoleServiceImpl implements UserRoleService{
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> selectUserRoleAll(){
        return userRoleMapper.selectUserRoleAll();
    }
}
