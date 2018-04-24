package dao.inter;

import entity.User;

/**
 * 用户模块
 * 持久层接口
 *
 * @author Orion Pax
 */
public interface UserDao {

    /**
     * 向数据库插入一条User记录
     *
     * @param user 封装User信息的对象
     * @return 返回影响的条数
     */
    int insert(User user) throws Exception;


    /**
     * 根据用户名和密码查询User
     *
     * @param user 封装用户名和密码的User对象
     * @return 查询到的User对象，没有返回null
     */
    User getByNameAndPwd(User user) throws Exception;

    /**
     * 根据用户名查询User记录
     *
     * @param username 用户名
     * @return 查询到的User对象
     */
    User getByName(String username) throws  Exception;
}
