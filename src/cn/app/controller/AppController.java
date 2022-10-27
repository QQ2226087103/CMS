package cn.app.controller;

import cn.app.biz.AppBiz;
import cn.app.biz.DirectionaryBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("app")
public class AppController extends AbstractController {
    @Resource
    AppBiz appBiz;
    @Resource
    DirectionaryBiz directionaryBiz;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String getAppList(Model model){
        model.addAttribute("appInfoList",appBiz.getAllApp());
        return "developer/appinfolist";
    }

    @RequestMapping(value = "appinfoadd")
    public String appInfoAdd(Model model){
        model.addAttribute("faltforms",directionaryBiz.getAllFlatform());
        return "developer/appinfoadd";
    }
}
