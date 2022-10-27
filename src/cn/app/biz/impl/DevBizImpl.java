package cn.app.biz.impl;

import cn.app.biz.DevBiz;
import cn.app.entity.Dev;
import cn.app.mapper.DevMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("devBiz")
@Transactional
public class DevBizImpl implements DevBiz {
    @Autowired
    DevMapper devMapper;

    @Override
    public Dev dologin(String devCode, String devPassword) {
        return devMapper.dologin(devCode,devPassword);
    }
}
