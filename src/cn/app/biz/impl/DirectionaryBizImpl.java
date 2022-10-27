package cn.app.biz.impl;

import cn.app.biz.DirectionaryBiz;
import cn.app.entity.Directionary;
import cn.app.mapper.DirectionaryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("directionaryBiz")
public class DirectionaryBizImpl implements DirectionaryBiz {
    @Resource
    DirectionaryMapper directionaryMapper;
    @Override
    public List<Directionary> getAllFlatform() {
        return directionaryMapper.getAllFlatform();
    }
}
