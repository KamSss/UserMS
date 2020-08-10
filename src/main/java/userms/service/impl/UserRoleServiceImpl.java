package userms.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userms.dto.UserRole;
import userms.mapper.UserRoleMapper;
import userms.service.UserRoleService;

import java.util.List;

/**
 * @author ZHZ
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> selectUserRoleAll(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return userRoleMapper.selectUserRoleAll();
    }

    @Override
    public List<UserRole> selectRoleTest(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userRoleMapper.selectRoleTest();
    }

    @Override
    public void distributionRole(UserRole userRole) {
        userRoleMapper.distributionRole(userRole);
    }


}
