package service.inter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品分类模块
 * 业务层接口
 *
 * @author Orion Pax
 */
public interface TypeService {

    /**
     * 得到所有一级标签的List，其中包含代表每一个一级标签的Map有type_id,type_name,和childTypeList
     *
     * @return 封装数据的typeMap
     */
    List<Map<String,Object>> getParentTypeList() throws Exception;
}
