package com.github.smartheye.springboot.demo.account.dal.mapper.auto;

import com.github.smartheye.springboot.demo.account.dal.domain.auto.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);
    
    Account selectByAccountId(String accountId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}