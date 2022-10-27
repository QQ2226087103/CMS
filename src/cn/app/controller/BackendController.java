package cn.app.controller;

import cn.app.biz.BackendBiz;
import cn.app.entity.Backend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("backendController")
public class BackendController {
    @Resource
    BackendBiz backendBiz;

    @GetMapping("tologin")
    public String tologin(){
        return "backendlogin";
    }

    @RequestMapping(value = "dologin",method = RequestMethod.POST)
    public String dologin(Model model, @Param("userCode")String userCode, @Param("userPassword")String userPassword){
        Backend backend = (Backend) backendBiz.dologin(userCode,userPassword);
        if (backend != null){
            model.addAttribute("backend",backend);
            return "backend/main";
        }else {
            model.addAttribute("error","用户名或密码不正确!");
            return "backendlogin";
        }
    }
}
