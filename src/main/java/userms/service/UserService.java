package userms.service;

import userms.dto.PagingParam;
import userms.dto.User;

import java.util.List;

/**
 * @author ZHZ
 *
 * @pragm u_id
 */
public interface UserService {
    User selectById(Integer u_id);
    List<User> selectAll(Integer pageNum,Integer pageSize);
    void deleteById(Integer id);
    void insertUser(User user);
    void updateUser(User user);
}
