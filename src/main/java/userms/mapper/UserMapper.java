package userms.mapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import userms.dto.PagingParam;
import userms.dto.User;

import java.util.List;

/**
 * @author ZHZ
 */
@Mapper
public interface UserMapper {
    /**
     * 通过id查询user表
     *
     * @param id user_t表的主键
     * @return User表Dto对象
     */
    User selectById(@Param("id") int id);
    /**
     * 全查询
     * @return User对象
     */
    List<User> selectAll();
    /**
     * id删除
     * @param id user_t表的主键
     */
    void deleteById(@Param("id") int id);
    /**
     * 插入user
     * @param user 插入一个新用户
     */
    void insertUser(User user);
    /**
     * 修改user
     * @param user 更新用户
     */
    void updateUser(User user);
}
