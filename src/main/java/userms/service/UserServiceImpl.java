package userms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userms.dto.User;
import userms.mapper.UserMapper;

import java.util.List;

/**
 * @author ZHZ
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Integer u_id) {
        return userMapper.selectById(u_id);
    }
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
