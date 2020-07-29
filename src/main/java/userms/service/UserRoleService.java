package userms.service;

import userms.dto.UserRole;

import java.util.List;

/**
 * @author ZHZ
 */
public interface UserRoleService {
    /**
     * 查询所有具有角色的用户和其拥有的角色
     * @return UserRole
     */
    List<UserRole> selectUserRoleAll();
}
