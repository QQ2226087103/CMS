package cn.app.biz.impl;

import cn.app.biz.BackendBiz;
import cn.app.entity.Backend;
import cn.app.mapper.BackendMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("backendBiz")
public class BackendBizImpl implements BackendBiz {
    @Resource
    BackendMapper backendMapper;

    @Override
    public Backend dologin(@Param("userCode")String userCode, @Param("userPassword")String userPassword) {
        return backendMapper.dologin(userCode,userPassword);
    }
}
