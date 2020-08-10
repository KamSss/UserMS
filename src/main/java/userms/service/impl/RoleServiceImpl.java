package userms.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userms.dto.Role;
import userms.mapper.RoleMapper;
import userms.service.RoleService;

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
    public List<Role> selectAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return roleMapper.selectAll();
    }

}
