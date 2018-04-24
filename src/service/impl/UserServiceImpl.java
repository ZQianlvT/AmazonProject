package service.impl;

import dao.impl.UserDaoImpl;
import dao.inter.UserDao;
import entity.User;
import service.inter.UserService;

/**
 * 用户模块
 * 业务层实现
 *
 * @author Orion Pax
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    /**
     * 注册一个用户,用户名存在就不成功。
     *
     * @param user 封装用户信息
     * @return 是否注册成功
     */
    @Override
    public boolean register(User user) throws Exception {
        boolean isExist = isExistByName(user.getUsername());
        if(isExist){
            return false;
        }
        int num = userDao.insert(user);
        return 1 == num;
    }

    /**
     * 以用户名和密码登录
     *
     * @param user 封装用户名和密码
     * @return 是否登录成功
     */
    @Override
    public boolean login(User user) throws Exception {
        User returnUser = userDao.getByNameAndPwd(user);
        return returnUser != null;
    }

    /**
     * 判断用户名在数据库中存在
     *
     * @param username 用户名
     * @return 是否存在
     */
    @Override
    public boolean isExistByName(String username) throws Exception {
        User user = userDao.getByName(username);
        return user != null;
    }
}
