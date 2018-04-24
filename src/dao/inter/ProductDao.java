package dao.inter;

import entity.User;

/**
 * 商品模块
 * 持久层接口
 *
 * @author Orion Pax
 */
public interface ProductDao {

    /**
     * 通过Id获取商品对象
     *
     * @param id 商品id
     * @return Product对象
     */
    User getById(Integer id);


}
