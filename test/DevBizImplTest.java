import cn.app.biz.DevBiz;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DevBizImplTest extends TestCase {

    public void testDologin() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        DevBiz devBiz = (DevBiz) applicationContext.getBean("devBiz");
        System.out.println(devBiz.dologin("test001", "123456"));
    }
}