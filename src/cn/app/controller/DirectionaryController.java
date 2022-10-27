package cn.app.controller;

import cn.app.biz.DirectionaryBiz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("app_flatform")
public class DirectionaryController {
    @Resource
    DirectionaryBiz directionaryBiz;
}
