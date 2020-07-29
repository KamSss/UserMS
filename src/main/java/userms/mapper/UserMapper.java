package userms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
}
