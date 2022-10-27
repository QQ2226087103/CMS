package cn.app.biz;

import cn.app.entity.App;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppBiz {
    List<App> getAllApp();

    List<App> getAppByInfo(@Param("softwareName")String softwareName, @Param("flatformName")String flatformName);
}
