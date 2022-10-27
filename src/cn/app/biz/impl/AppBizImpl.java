package cn.app.biz.impl;

import cn.app.biz.AppBiz;
import cn.app.entity.App;
import cn.app.mapper.AppMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("appBiz")
public class AppBizImpl implements AppBiz {
    @Resource
    AppMapper appMapper;

    @Override
    public List<App> getAllApp() {
        return appMapper.getAllApp();
    }

    @Override
    public List<App> getAppByInfo(String softwareName, String flatformName) {
        return appMapper.getAppByInfo(softwareName,flatformName);
    }
}
