package userms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import userms.dto.User;
import userms.dto.UserRole;

import java.util.List;

/**
 * @author ZHZ
 */
@Mapper
public interface UserRoleMapper {
    /**
     * 查询所有拥有角色的用户，和其拥有的角色
     * @return UserRole
     */
    List<UserRole> selectUserRoleAll();
}
