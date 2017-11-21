package com.tdw.fmis.account.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_account_bank_card")
public class AccountBankCard {
    /**
     * 账户银行卡编号guid
     */
    @Id
    @Column(name = "account_bank_id")
    private String accountBankId;

    /**
     * 账户编号
     */
    @Column(name = "account_id")
    private String accountId;

    /**
     * 银行账号
     */
    @Column(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 开户行
     */
    @Column(name = "open_bank")
    private String openBank;

    /**
     * 开户支行
     */
    @Column(name = "open_sub_bank")
    private String openSubBank;

    /**
     * 银行卡归属地省
     */
    @Column(name = "bank_province")
    private String bankProvince;

    /**
     * 银行卡归属地市
     */
    @Column(name = "bank_city")
    private String bankCity;

    /**
     * 银行卡预留手机号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

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
     * 状态1:可用,0:不可用
     */
    @Column(name = "status_flag")
    private Integer statusFlag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否主卡,1:主卡,0:副卡
     */
    @Column(name = "main_flag")
    private Integer mainFlag;

    /**
     * 是否注册了存管,1.是,0:否
     */
    @Column(name = "cunguan_flag")
    private Integer cunguanFlag;

    /**
     * 获取账户银行卡编号guid
     *
     * @return account_bank_id - 账户银行卡编号guid
     */
    public String getAccountBankId() {
        return accountBankId;
    }

    /**
     * 设置账户银行卡编号guid
     *
     * @param accountBankId 账户银行卡编号guid
     */
    public void setAccountBankId(String accountBankId) {
        this.accountBankId = accountBankId;
    }

    /**
     * 获取账户编号
     *
     * @return account_id - 账户编号
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户编号
     *
     * @param accountId 账户编号
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取银行账号
     *
     * @return bank_card_no - 银行账号
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 设置银行账号
     *
     * @param bankCardNo 银行账号
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 获取开户行
     *
     * @return open_bank - 开户行
     */
    public String getOpenBank() {
        return openBank;
    }

    /**
     * 设置开户行
     *
     * @param openBank 开户行
     */
    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    /**
     * 获取开户支行
     *
     * @return open_sub_bank - 开户支行
     */
    public String getOpenSubBank() {
        return openSubBank;
    }

    /**
     * 设置开户支行
     *
     * @param openSubBank 开户支行
     */
    public void setOpenSubBank(String openSubBank) {
        this.openSubBank = openSubBank;
    }

    /**
     * 获取银行卡归属地省
     *
     * @return bank_province - 银行卡归属地省
     */
    public String getBankProvince() {
        return bankProvince;
    }

    /**
     * 设置银行卡归属地省
     *
     * @param bankProvince 银行卡归属地省
     */
    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    /**
     * 获取银行卡归属地市
     *
     * @return bank_city - 银行卡归属地市
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * 设置银行卡归属地市
     *
     * @param bankCity 银行卡归属地市
     */
    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    /**
     * 获取银行卡预留手机号码
     *
     * @return phone_number - 银行卡预留手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置银行卡预留手机号码
     *
     * @param phoneNumber 银行卡预留手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * 获取状态1:可用,0:不可用
     *
     * @return status_flag - 状态1:可用,0:不可用
     */
    public Integer getStatusFlag() {
        return statusFlag;
    }

    /**
     * 设置状态1:可用,0:不可用
     *
     * @param statusFlag 状态1:可用,0:不可用
     */
    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
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

    /**
     * 获取是否主卡,1:主卡,0:副卡
     *
     * @return main_flag - 是否主卡,1:主卡,0:副卡
     */
    public Integer getMainFlag() {
        return mainFlag;
    }

    /**
     * 设置是否主卡,1:主卡,0:副卡
     *
     * @param mainFlag 是否主卡,1:主卡,0:副卡
     */
    public void setMainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
    }

    /**
     * 获取是否注册了存管,1.是,0:否
     *
     * @return cunguan_flag - 是否注册了存管,1.是,0:否
     */
    public Integer getCunguanFlag() {
        return cunguanFlag;
    }

    /**
     * 设置是否注册了存管,1.是,0:否
     *
     * @param cunguanFlag 是否注册了存管,1.是,0:否
     */
    public void setCunguanFlag(Integer cunguanFlag) {
        this.cunguanFlag = cunguanFlag;
    }
}