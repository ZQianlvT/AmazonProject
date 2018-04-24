package service.inter;

import entity.User;

/**
 * 用户模块
 * 业务层接口
 *
 * @author Orion Pax
 */
public interface UserService {
    /**
     * 注册一个用户
     *
     * @param user 封装用户信息
     * @return 是否注册成功
     */
    boolean register(User user) throws Exception;

    /**
     * 以用户名和密码登录
     *
     * @param user 封装用户名和密码
     * @return 是否登录成功
     */
    boolean login(User user) throws Exception;

    /**
     * 判断用户名在数据库中存在
     *
     * @param username 用户名
     * @return 是否存在
     */
    boolean isExistByName(String username) throws Exception;
}
