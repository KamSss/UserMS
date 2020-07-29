package userms.service;

import userms.dto.User;

import java.util.List;

/**
 * @author ZHZ
 *
 * @pragm u_id
 */
public interface UserService {
    User selectById(Integer u_id);
    List<User> selectAll();

}
