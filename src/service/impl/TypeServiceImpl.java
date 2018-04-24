package service.impl;

import dao.impl.TypeDaoImpl;
import dao.inter.TypeDao;
import entity.Type;
import service.inter.TypeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeServiceImpl implements TypeService {
    private TypeDao typeDao = new TypeDaoImpl();
    /**
     * 得到封装一级标签的Map，其中有type_id,type_name,和childTypeList
     *
     * @return 封装数据的typeMap
     */
    @Override
    public List<Map<String,Object>> getParentTypeList() throws Exception {
        List<Map<String,Object>> parentTypeList = new ArrayList<>();
        List<Type> typeList = typeDao.getAll();
        for (Type type : typeList) {
            //判断商品类型是一级标签还是二级标签
            Integer super_type_id = type.getSuper_type_id();
            if(type.getType_id().equals(super_type_id)){ //一级标签
                Map<String,Object> parentTypeMap = new HashMap<>();
                parentTypeMap.put("type_id",type.getType_id());
                parentTypeMap.put("type_name",type.getType_name());
                parentTypeMap.put("childTypeList",new ArrayList<Type>());
                parentTypeList.add(parentTypeMap);
            }else{  //二级标签
                //获取对应的一级标签的childTypeList
                for (Map<String, Object> map : parentTypeList) {
                    Integer s_id = (Integer) map.get("type_id");
                    if(s_id.equals(super_type_id)){    //找到对应的父标签的Map
                        List<Type> childTypeList = (List<Type>) map.get("childTypeList");
                        childTypeList.add(type);
                    }
                }
            }
        }

        return parentTypeList;
    }
}
