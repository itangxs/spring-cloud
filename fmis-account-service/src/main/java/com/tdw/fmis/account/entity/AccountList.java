package com.tdw.fmis.account.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_account_list")
public class AccountList {
    /**
     * 明细编号
     */
    @Id
    @Column(name = "list_id")
    private Integer listId;

    /**
     * 账户编号
     */
    @Column(name = "account_id")
    private String accountId;

    /**
     * 记账日期
     */
    @Column(name = "account_time")
    private Date accountTime;

    /**
     * 业务编号
     */
    @Column(name = "business_id")
    private String businessId;

    /**
     * 记账金额
     */
    private BigDecimal amount;

    /**
     * 银行账号
     */
    @Column(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 账户银行卡编号guid
     */
    @Column(name = "account_bank_id")
    private String accountBankId;

    /**
     * 费用项目
     */
    @Column(name = "fee_id")
    private String feeId;

    /**
     * 交易活动,0满标分润,1提现放款...
     */
    @Column(name = "action_id")
    private Integer actionId;

    /**
     * 收支类型,0支出,1收入
     */
    @Column(name = "in_out")
    private Integer inOut;

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
     * 状态
     */
    @Column(name = "status_flag")
    private Integer statusFlag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取明细编号
     *
     * @return list_id - 明细编号
     */
    public Integer getListId() {
        return listId;
    }

    /**
     * 设置明细编号
     *
     * @param listId 明细编号
     */
    public void setListId(Integer listId) {
        this.listId = listId;
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
     * 获取记账日期
     *
     * @return account_time - 记账日期
     */
    public Date getAccountTime() {
        return accountTime;
    }

    /**
     * 设置记账日期
     *
     * @param accountTime 记账日期
     */
    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    /**
     * 获取业务编号
     *
     * @return business_id - 业务编号
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置业务编号
     *
     * @param businessId 业务编号
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * 获取记账金额
     *
     * @return amount - 记账金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置记账金额
     *
     * @param amount 记账金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
     * 获取费用项目
     *
     * @return fee_id - 费用项目
     */
    public String getFeeId() {
        return feeId;
    }

    /**
     * 设置费用项目
     *
     * @param feeId 费用项目
     */
    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    /**
     * 获取交易活动,0满标分润,1提现放款...
     *
     * @return action_id - 交易活动,0满标分润,1提现放款...
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * 设置交易活动,0满标分润,1提现放款...
     *
     * @param actionId 交易活动,0满标分润,1提现放款...
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取收支类型,0支出,1收入
     *
     * @return in_out - 收支类型,0支出,1收入
     */
    public Integer getInOut() {
        return inOut;
    }

    /**
     * 设置收支类型,0支出,1收入
     *
     * @param inOut 收支类型,0支出,1收入
     */
    public void setInOut(Integer inOut) {
        this.inOut = inOut;
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
     * 获取状态
     *
     * @return status_flag - 状态
     */
    public Integer getStatusFlag() {
        return statusFlag;
    }

    /**
     * 设置状态
     *
     * @param statusFlag 状态
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
}