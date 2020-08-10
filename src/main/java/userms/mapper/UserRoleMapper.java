package userms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import userms.dto.Role;
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
    /**
     * 查询所有拥有角色的用户，和其拥有的角色
     * @return UserRole
     */
    List<UserRole> selectRoleTest();
    /**
     * 给user分配role角色
     * @param userRole 用户角色dto
     */
    void distributionRole(UserRole userRole);
}
