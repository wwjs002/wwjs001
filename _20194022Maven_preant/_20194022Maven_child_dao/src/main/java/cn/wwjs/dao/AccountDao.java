package cn.wwjs.dao;

import cn.wwjs.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(username,money) values(#{username},#{money})")
    void save(Account account);


    @Select("select * from account where id=#{id}")
   Account findbyid(int id);

    @Update("update ")
    void update(Account account);
}
