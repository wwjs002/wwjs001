package cn.wwjs.service;

import cn.wwjs.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void save(Account account);
}
