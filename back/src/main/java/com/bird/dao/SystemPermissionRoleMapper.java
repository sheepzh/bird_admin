package com.bird.dao;

import com.bird.model.entity.SystemPermissionRole;
import com.bird.model.entity.SystemPermissionRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemPermissionRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYSTEM_PERMISSION_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    long countByExample(SystemPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYSTEM_PERMISSION_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int deleteByExample(SystemPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYSTEM_PERMISSION_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int insert(SystemPermissionRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYSTEM_PERMISSION_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int insertSelective(SystemPermissionRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYSTEM_PERMISSION_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    List<SystemPermissionRole> selectByExample(SystemPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYSTEM_PERMISSION_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") SystemPermissionRole record, @Param("example") SystemPermissionRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYSTEM_PERMISSION_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int updateByExample(@Param("record") SystemPermissionRole record, @Param("example") SystemPermissionRoleExample example);
}