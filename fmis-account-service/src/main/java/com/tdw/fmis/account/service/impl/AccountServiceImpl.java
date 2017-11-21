/*
 * 文件名 AccountServiceImpl.java
 * 版权 Copyright 2017 团贷网
 * 创建人 谭荣巧
 * 创建时间 2017年11月20日 上午10:13:13 
 */
package com.tdw.fmis.account.service.impl;

import org.springframework.stereotype.Service;

import com.tdw.fmis.account.entity.Account;
import com.tdw.fmis.account.mapper.AccountMapper;
import com.tdw.fmis.account.service.AccountService;
import com.tdw.fmis.common.service.impl.BaseServiceImpl;

/**
 * 账号信息业务逻辑实现<br>
 * 
 * @author 谭荣巧
 * @date 2017年11月20日 上午10:13:13
 * @since fmis-account-service 1.0-SNAPSHOT
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<AccountMapper, Account> implements AccountService {

}
