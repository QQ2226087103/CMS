package cn.app.mapper;

import cn.app.entity.Backend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackendMapper {

    Backend dologin(@Param("userCode")String userCode,@Param("userPassword")String userPassword);

}
