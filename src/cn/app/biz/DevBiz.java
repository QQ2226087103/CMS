package cn.app.biz;

import cn.app.entity.Dev;
import org.apache.ibatis.annotations.Param;

public interface DevBiz {
    Dev dologin(@Param("devCode") String devCode, @Param("devPassword") String devPassword);
}
