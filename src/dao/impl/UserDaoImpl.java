package dao.impl;

import dao.inter.UserDao;
import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import util.JdbcUtil;

import java.sql.SQLException;
import java.text.DateFormat;

/**
 * 用户模块
 * 持久层实现
 *
 * @author Orion Pax
 */
public class UserDaoImpl implements UserDao {
    private QueryRunner queryRunner = JdbcUtil.getQueryRunner();

    /**
     * 向数据库插入一条User记录
     *
     * @param user 封装User信息的对象
     */
    @Override
    public int insert(User user) throws Exception {
        String sql = "insert into A_USER(user_id,username,pwd,gender,brithday,unique_number,mail,phone,address) " +
                "values(A_USER_SEQ.nextval,?,?,?,to_date(?,'yyyy-mm-dd'),?,?,?,?)";
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String brithday = dateFormat.format(user.getBrithday());
        return queryRunner.update(sql, user.getUsername(), user.getPwd(), user.getGender(), brithday, user.getUnique_number(), user.getMail(), user.getPhone(), user.getAddress());
    }

    /**
     * 根据用户名和密码查询User
     *
     * @param user 封装用户名和密码的User对象
     * @return 查询到的User对象，没有返回null
     */
    @Override
    public User getByNameAndPwd(User user) throws SQLException {
        String sql ="select user_id,username,pwd,gender,brithday,unique_number,mail,phone,address from a_user where username = ? and pwd = ?";
        return queryRunner.query(sql, new BeanHandler<>(User.class), user.getUsername(), user.getPwd());
    }

    /**
     * 根据用户名查询User记录
     *
     * @param username 用户名
     * @return 查询到的User对象
     */
    @Override
    public User getByName(String username) throws Exception {
        String sql ="select user_id,username,pwd,gender,brithday,unique_number,mail,phone,address from a_user where username = ?";
        return queryRunner.query(sql, new BeanHandler<>(User.class),username);
    }
}
