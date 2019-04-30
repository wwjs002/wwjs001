package cn.wwjs.service.imp;

import cn.wwjs.dao.AccountDao;
import cn.wwjs.domain.Account;
import cn.wwjs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImp implements AccountService {

        @Autowired
        private AccountDao accountDao;

    public List<Account> findAll() {
        return this.accountDao.findAll();
    }

    public void save(Account account) {
        accountDao.save(account);
        System.out.println("加不进去");
    }
}
