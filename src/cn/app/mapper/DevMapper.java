package cn.app.mapper;

import cn.app.entity.Dev;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface DevMapper {
    Dev dologin(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
