package userms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import userms.dto.Role;
import userms.dto.User;

import java.util.List;

/**
 * @author ZHZ
 */
@Mapper
public interface RoleMapper {
    /**
     * 通过id查询
     * @param id 对象
     * @return Role对象
     */
    Role selectById(@Param("id") Integer id);
    /**
     * 全查询
     * @return Role对象
     */
    List<Role> selectAll();
}
