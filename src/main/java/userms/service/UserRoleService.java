package userms.service;

import userms.dto.Role;
import userms.dto.User;
import userms.dto.UserRole;

import java.util.List;

/**
 * @author ZHZ
 */
public interface UserRoleService {
    /**
     * 查询所有具有角色的用户和其拥有的角色
     * @param pageNum 分页页数
     * @param pageSize 每页个数
     * @return UserRole
     */
    List<UserRole> selectUserRoleAll(Integer pageNum,Integer pageSize);
    /**
     * 两张表的查询测试
     * @return UserRole
     */
    List<UserRole> selectRoleTest(Integer pageNum,Integer pageSize);
    /**
     * 给user分配role角色
     * @param userRole 中间表
     */
    void distributionRole(UserRole userRole);
}
