package test.service.impl;

import entity.User;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import service.impl.UserServiceImpl;
import service.inter.UserService;

import java.util.Date;

/**
 * UserServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/23/2018</pre>
 */
public class UserServiceImplTest {

    private UserService userService;

    @Before
    public void before() throws Exception {
        userService = new UserServiceImpl();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: register(User user)
     */
    @Test
    public void testRegister() throws Exception {
        User user  = new User("dddd","dddd","女",new Date(),"aaa","aaa","123","aaa");
        boolean flag = userService.register(user);
        if(flag){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }

//TODO: Test goes here...
    }

    /**
     * Method: login(User user)
     */
    @Test
    public void testLogin() throws Exception {
//TODO: Test goes here...
        User user = new User("a111","1234");
        boolean flag = userService.login(user);
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }

    /**
     * Method: isExistByName(String username)
     */
    @Test
    public void testIsExistByName() throws Exception {
//TODO: Test goes here...
        boolean flag = userService.isExistByName("ddd");
        if(flag){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }


} 
