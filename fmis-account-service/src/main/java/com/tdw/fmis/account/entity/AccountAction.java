package com.tdw.fmis.account.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_account_action")
public class AccountAction {
    /**
     * 交易活动编号
     */
    @Id
    @Column(name = "action_id")
    private Integer actionId;

    /**
     * 交易活动名称
     */
    @Column(name = "action_name")
    private String actionName;

    /**
     * 状态1:开启0:关闭
     */
    @Column(name = "status_flag")
    private Integer statusFlag;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新用户
     */
    @Column(name = "update_user")
    private String updateUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取交易活动编号
     *
     * @return action_id - 交易活动编号
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * 设置交易活动编号
     *
     * @param actionId 交易活动编号
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取交易活动名称
     *
     * @return action_name - 交易活动名称
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * 设置交易活动名称
     *
     * @param actionName 交易活动名称
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * 获取状态1:开启0:关闭
     *
     * @return status_flag - 状态1:开启0:关闭
     */
    public Integer getStatusFlag() {
        return statusFlag;
    }

    /**
     * 设置状态1:开启0:关闭
     *
     * @param statusFlag 状态1:开启0:关闭
     */
    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }

    /**
     * 获取创建用户
     *
     * @return create_user - 创建用户
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新用户
     *
     * @return update_user - 更新用户
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新用户
     *
     * @param updateUser 更新用户
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}