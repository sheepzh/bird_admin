package com.bird.dao;

import com.bird.model.entity.StaffRole;
import com.bird.model.entity.StaffRoleExample;
import com.bird.model.entity.StaffRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    long countByExample(StaffRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int deleteByExample(StaffRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int deleteByPrimaryKey(StaffRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int insert(StaffRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int insertSelective(StaffRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    List<StaffRole> selectByExample(StaffRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    StaffRole selectByPrimaryKey(StaffRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") StaffRole record, @Param("example") StaffRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int updateByExample(@Param("record") StaffRole record, @Param("example") StaffRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(StaffRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_STAFF_ROLE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    int updateByPrimaryKey(StaffRole record);
}