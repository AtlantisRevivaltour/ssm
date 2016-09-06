import com.alibaba.fastjson.JSON;
import com.atlantis.pojo.User;
import com.atlantis.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.logging.Logger;


/**
 * Created by IntelliJ IDEA
 * TestMybatis class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/9/5
 * Time: 下午1:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
    private  static Logger logger = Logger.getLogger(TestMybatis.class.getName());

    @Resource
    private IUserService userService;

    @Test
    public void test1(){
        User user =userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }

}
