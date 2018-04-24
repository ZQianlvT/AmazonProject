package dao.impl;

import dao.inter.TypeDao;
import entity.Type;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.JdbcUtil;

import java.util.List;

public class TypeDaoImpl implements TypeDao {
    private QueryRunner queryRunner = JdbcUtil.getQueryRunner();
    /**
     * 获取全部商品类型
     *
     * @return 商品类型列表
     */
    @Override
    public List<Type> getAll() throws Exception {
        String sql ="SELECT TYPE_ID,TYPE_NAME,SUPER_TYPE_ID FROM A_TYPE";
        return  queryRunner.query(sql, new BeanListHandler<>(Type.class));
    }

    public Type getById(Integer id) throws Exception{
        String sql ="SELECT TYPE_ID,TYPE_NAME,SUPER_TYPE_ID FROM A_TYPE WHERE TYPE_ID = ?";
        return queryRunner.query(sql,new BeanHandler<>(Type.class),id);
    }
}
