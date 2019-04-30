package cn.wwjs.contorller;


import cn.wwjs.domain.Account;
import cn.wwjs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountContorller {
        @Autowired
        private AccountService accountService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> list = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject("list",list);
        System.out.println("控制层");
        return  modelAndView;
    }

    @RequestMapping("/save")
    public void save( Account account,HttpServletRequest request, HttpServletResponse response) throws IOException {
      accountService.save(account);
        System.out.println("添加");
        response.sendRedirect(request.getContextPath()+"/account/findAll");

    }
}
