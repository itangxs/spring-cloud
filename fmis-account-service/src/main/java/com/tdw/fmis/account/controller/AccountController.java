/*
 * 文件名 AccountController.java
 * 版权 Copyright 2017 团贷网
 * 创建人 谭荣巧
 * 创建时间 2017年11月20日 上午10:14:50 
 */
package com.tdw.fmis.account.controller;

import com.tdw.fmis.common.result.Result;
import com.tdw.fmis.common.utils.FieldValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tdw.fmis.account.entity.Account;
import com.tdw.fmis.account.service.AccountService;

import java.util.List;

/**
 * 账号信息业务接口<br>
 * 
 * @author 谭荣巧
 * @date 2017年11月20日 上午10:14:50
 * @since fmis-account-service 1.0-SNAPSHOT
 */
@Api(tags = "TbAccountControllerApi",description = "账户管理接口相关api描述",hidden = true)
@RestController
public class AccountController {

	private Logger logger = LoggerFactory.getLogger(AccountController.class);
	@Autowired
	AccountService accountService;

	/**
	 * 根据id查询账号信息<br>
	 * 
	 * @author 谭荣巧
	 * @date 2017年11月20日 上午10:51:44
	 * @param id
	 *            账号编号
	 * @return 账号信息
	 * @since fmis-account-service 1.0-SNAPSHOT
	 */
	@ApiOperation(value = "根据ID查询账户基本信息")
	@ApiImplicitParam(paramType="path",name="id",dataType="String",required=true,value="账户编号")
	@GetMapping("/account/{id}")
	public Result getAccountById(@PathVariable("id") String id) {
		if(FieldValidator.isEmpty(id))
		{
			return Result.error("400","账户编号不能为空");
		}
		Account account = null;
		try
		{
			account = accountService.selectById(id);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			return Result.error("401","数据库访问异常");
		}
		return Result.success(account);
	}

	/**
	 * @author 汤孝松
	 * @date 2017/11/20
	 */
	@ApiOperation(value = "查询所有账户基本信息")
	@GetMapping(value = "/account")
	public Result getAllAccount(){
		List<Account> account = null;
		try
		{
			account = accountService.selectListAll();
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			return Result.error("401","数据库访问异常");
		}
		return Result.success(account);
	}

	/**
	 * @author 汤孝松
	 * @date 2017/11/20
	 */
	@ApiOperation("删除账户")
	@ApiImplicitParam(paramType="path",name="accountId",dataType="String",required=true,value="账户编号")
	@DeleteMapping(value = "/account/{accountId}")
	public Result delAccount(@PathVariable(name = "accountId") String accountId){
		if(FieldValidator.isEmpty(accountId))
		{
			return Result.error("400","账户编号不能为空");
		}
		Integer row = null;
		try
		{
			row = accountService.deleteById(accountId);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			return Result.error("401","数据库访问异常");
		}

		return Result.success("操作条数为："+row);
	}


	/**
	 * @author 汤孝松
	 * @date 2017/11/20
	 */
	@ApiOperation("新增账户")
	@ApiImplicitParam(paramType="body",name="account",dataType="Account",required=true,value="账户实体")
	@PostMapping(value = "/account")
	public Result addAccount(@RequestBody Account account){

		if(FieldValidator.validaModelRequiredField(account))
		{
			return Result.error("400","必填字段不能为空");
		}
		Integer row = null;
		try
		{
			row = accountService.insertSelective(account);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			return Result.error("401","数据库访问异常");
		}

		return Result.success("操作条数为："+row);
	}

	/**
	 * @author 汤孝松
	 * @date 2017/11/20
	 */
	@ApiOperation("更新账户")
	@ApiImplicitParam(paramType="body",name="account",dataType="Account",required=true,value="账户实体")
	@PutMapping(value = "/account")
	public Result updateAccount(@RequestBody Account account){

		if(FieldValidator.validaModelRequiredField(account))
		{
			return Result.error("400","必填字段不能为空");
		}
		Integer row = null;
		try
		{
			row = accountService.updateSelectiveById(account);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			return Result.error("401","数据库访问异常");
		}

		return Result.success("操作条数为："+row);
	}
}
