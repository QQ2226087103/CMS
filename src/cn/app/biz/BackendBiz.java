package cn.app.biz;

import cn.app.entity.Backend;
import org.apache.ibatis.annotations.Param;

public interface BackendBiz {
    Backend dologin(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}
