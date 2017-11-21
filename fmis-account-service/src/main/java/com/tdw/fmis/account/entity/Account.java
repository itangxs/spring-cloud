package com.tdw.fmis.account.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_account")
public class Account {
    /**
     * 账户编号guid
     */
    @Id
    @Column(name = "account_id")
    private String accountId;

    /**
     * 账户号码,帐号标识
     */
    @Column(name = "account_no")
    private String accountNo;

    /**
     * 账户类型表账户编号0:借款人账户1:分公司账户...
     */
    @Column(name = "account_type")
    private Integer accountType;

    /**
     * 账户名称
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 账户主体编号,个人是身份证,企业是统一信用编码或者营业执照
     */
    @Column(name = "main_id")
    private String mainId;

    /**
     * 账户主体编号,1;个人,2:企业
     */
    @Column(name = "main_type")
    private Integer mainType;

    /**
     * 所属资产端,1:鸿特,2:一点车贷...
     */
    @Column(name = "business_from")
    private Integer businessFrom;

    /**
     * 所属分公司
     */
    @Column(name = "branch_id")
    private String branchId;

    /**
     * 可用余额
     */
    @Column(name = "account_amount")
    private BigDecimal accountAmount;

    /**
     * 冻结余额
     */
    @Column(name = "frozen_amount")
    private BigDecimal frozenAmount;

    /**
     * 账户状态,1:启用,0:禁用
     */
    @Column(name = "status_flag")
    private Integer statusFlag;

    /**
     * 账户是否被冻结,1:冻结,0:未冻结
     */
    @Column(name = "frozen_flag")
    private Integer frozenFlag;

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
     * 备注
     */
    private String remark;

    /**
     * 获取账户编号guid
     *
     * @return account_id - 账户编号guid
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户编号guid
     *
     * @param accountId 账户编号guid
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取账户号码,帐号标识
     *
     * @return account_no - 账户号码,帐号标识
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账户号码,帐号标识
     *
     * @param accountNo 账户号码,帐号标识
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 获取账户类型表账户编号0:借款人账户1:分公司账户...
     *
     * @return account_type - 账户类型表账户编号0:借款人账户1:分公司账户...
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置账户类型表账户编号0:借款人账户1:分公司账户...
     *
     * @param accountType 账户类型表账户编号0:借款人账户1:分公司账户...
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取账户名称
     *
     * @return account_name - 账户名称
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置账户名称
     *
     * @param accountName 账户名称
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取账户主体编号,个人是身份证,企业是统一信用编码或者营业执照
     *
     * @return main_id - 账户主体编号,个人是身份证,企业是统一信用编码或者营业执照
     */
    public String getMainId() {
        return mainId;
    }

    /**
     * 设置账户主体编号,个人是身份证,企业是统一信用编码或者营业执照
     *
     * @param mainId 账户主体编号,个人是身份证,企业是统一信用编码或者营业执照
     */
    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    /**
     * 获取账户主体编号,1;个人,2:企业
     *
     * @return main_type - 账户主体编号,1;个人,2:企业
     */
    public Integer getMainType() {
        return mainType;
    }

    /**
     * 设置账户主体编号,1;个人,2:企业
     *
     * @param mainType 账户主体编号,1;个人,2:企业
     */
    public void setMainType(Integer mainType) {
        this.mainType = mainType;
    }

    /**
     * 获取所属资产端,1:鸿特,2:一点车贷...
     *
     * @return business_from - 所属资产端,1:鸿特,2:一点车贷...
     */
    public Integer getBusinessFrom() {
        return businessFrom;
    }

    /**
     * 设置所属资产端,1:鸿特,2:一点车贷...
     *
     * @param businessFrom 所属资产端,1:鸿特,2:一点车贷...
     */
    public void setBusinessFrom(Integer businessFrom) {
        this.businessFrom = businessFrom;
    }

    /**
     * 获取所属分公司
     *
     * @return branch_id - 所属分公司
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 设置所属分公司
     *
     * @param branchId 所属分公司
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * 获取可用余额
     *
     * @return account_amount - 可用余额
     */
    public BigDecimal getAccountAmount() {
        return accountAmount;
    }

    /**
     * 设置可用余额
     *
     * @param accountAmount 可用余额
     */
    public void setAccountAmount(BigDecimal accountAmount) {
        this.accountAmount = accountAmount;
    }

    /**
     * 获取冻结余额
     *
     * @return frozen_amount - 冻结余额
     */
    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    /**
     * 设置冻结余额
     *
     * @param frozenAmount 冻结余额
     */
    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    /**
     * 获取账户状态,1:启用,0:禁用
     *
     * @return status_flag - 账户状态,1:启用,0:禁用
     */
    public Integer getStatusFlag() {
        return statusFlag;
    }

    /**
     * 设置账户状态,1:启用,0:禁用
     *
     * @param statusFlag 账户状态,1:启用,0:禁用
     */
    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }

    /**
     * 获取账户是否被冻结,1:冻结,0:未冻结
     *
     * @return frozen_flag - 账户是否被冻结,1:冻结,0:未冻结
     */
    public Integer getFrozenFlag() {
        return frozenFlag;
    }

    /**
     * 设置账户是否被冻结,1:冻结,0:未冻结
     *
     * @param frozenFlag 账户是否被冻结,1:冻结,0:未冻结
     */
    public void setFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
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

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}