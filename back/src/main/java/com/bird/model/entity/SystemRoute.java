package com.bird.model.entity;

import java.io.Serializable;

public class SystemRoute implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYSTEM_ROUTE.id
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYSTEM_ROUTE.path
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYSTEM_ROUTE.parent
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Integer parent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYSTEM_ROUTE.async
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private Boolean async;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYSTEM_ROUTE.des
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private String des;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYSTEM_ROUTE
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYSTEM_ROUTE.id
     *
     * @return the value of T_SYSTEM_ROUTE.id
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYSTEM_ROUTE.id
     *
     * @param id the value for T_SYSTEM_ROUTE.id
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYSTEM_ROUTE.path
     *
     * @return the value of T_SYSTEM_ROUTE.path
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYSTEM_ROUTE.path
     *
     * @param path the value for T_SYSTEM_ROUTE.path
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYSTEM_ROUTE.parent
     *
     * @return the value of T_SYSTEM_ROUTE.parent
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYSTEM_ROUTE.parent
     *
     * @param parent the value for T_SYSTEM_ROUTE.parent
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYSTEM_ROUTE.async
     *
     * @return the value of T_SYSTEM_ROUTE.async
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public Boolean getAsync() {
        return async;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYSTEM_ROUTE.async
     *
     * @param async the value for T_SYSTEM_ROUTE.async
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setAsync(Boolean async) {
        this.async = async;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYSTEM_ROUTE.des
     *
     * @return the value of T_SYSTEM_ROUTE.des
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYSTEM_ROUTE.des
     *
     * @param des the value for T_SYSTEM_ROUTE.des
     *
     * @mbg.generated Wed Nov 13 05:06:51 GMT+08:00 2019
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
}