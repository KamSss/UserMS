package userms.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userms.dto.PagingParam;
import userms.dto.User;
import userms.mapper.UserMapper;
import userms.service.UserService;

import java.util.List;

/**
 * @author ZHZ
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Integer u_id) {
        return userMapper.selectById(u_id);
    }
    @Override
    public List<User> selectAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAll();
    }
    @Override
    public void deleteById(Integer id){
        userMapper.deleteById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

}
