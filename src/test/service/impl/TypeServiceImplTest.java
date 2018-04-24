package test.service.impl; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import service.impl.TypeServiceImpl;

import java.util.List;
import java.util.Map;

/** 
* TypeServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>04/24/2018</pre> 
* @version 1.0 
*/ 
public class TypeServiceImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getParentTypeList() 
* 
*/ 
@Test
public void testGetParentTypeList() throws Exception { 
//TODO: Test goes here...
    List<Map<String, Object>> parentTypeList = new TypeServiceImpl().getParentTypeList();
    for (Map<String, Object> map : parentTypeList) {
        System.out.println(map);
    }
} 


} 
