package cn.app.controller;

import cn.app.biz.DevBiz;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("devController")
public class DevController extends AbstractController {
    @Autowired
    DevBiz devBiz;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }

    @GetMapping("tologin")
    public String tologin(){
        return "devlogin";
    }

    @RequestMapping(value = "dologin",method = RequestMethod.POST)
    public String dologin(Model model, @RequestParam("devCode")String devCode, @RequestParam("devPassword")String devPassword){
        if (devBiz.dologin(devCode,devPassword) != null){
            model.addAttribute("devCode",devCode);
            return "developer/main";
        }else {
            model.addAttribute("error","用户名或密码不正确!");
            return "devlogin";
        }
    }
}