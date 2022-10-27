package cn.app.controller;

import cn.app.biz.AppBiz;
import cn.app.biz.DirectionaryBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("backend")
public class Backend_app extends AbstractController {
    @Resource
    private AppBiz appBiz;
    @Resource
    private DirectionaryBiz directionaryBiz;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String backend(Model model){
        model.addAttribute("flatFormList",directionaryBiz.getAllFlatform());
        model.addAttribute("appInfoList",appBiz.getAllApp());
        return "backend/applist";
    }

    @RequestMapping("search")
    public String search(Model model, @RequestParam("softwareName")String softwareName,@RequestParam("flatforms")String flatforms){
        model.addAttribute("app",appBiz.getAppByInfo(softwareName,flatforms));
        return "backend/appcheck";
    }

}