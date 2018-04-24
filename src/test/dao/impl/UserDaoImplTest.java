package test.dao.impl;

import dao.impl.UserDaoImpl;
import dao.inter.UserDao;
import entity.User;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Date;

/**
 * UserDaoImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/23/2018</pre>
 */
public class UserDaoImplTest {


    private UserDao userDao;
    @Before
    public void before() throws Exception {
        userDao = new UserDaoImpl();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: insert(User user)
     */
    @Test
    public void testInsert() throws Exception {
        User user  = new User("ccc","ccc","女",new Date(),"aaa","aaa","123","aaa");
        userDao.insert(user);
    }

    /**
     * Method: getByNameAndPwd(User user)
     */
    @Test
    public void testGetByNameAndPwd() throws Exception {
        User user = new User("aaa","aaa");
        User byNameAndPwd = userDao.getByNameAndPwd(user);
        System.out.println(byNameAndPwd);
    }

    /**
     * Method: getByName(String username)
     */
    @Test
    public void testGetByName() throws Exception {
        System.out.println(userDao.getByName("a111"));
    }


} 
