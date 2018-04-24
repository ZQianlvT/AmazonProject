package dao.inter;

import entity.Type;

import java.util.List;

/**
 * 商品分类模块
 * 持久层接口
 *
 * @author Orion Pax
 */
public interface TypeDao {

    /**
     * 获取全部商品类型
     *
     * @return 商品类型列表
     */
    List<Type> getAll() throws Exception;
}
