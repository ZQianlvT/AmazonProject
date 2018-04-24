package test.dao.impl;

import dao.impl.TypeDaoImpl;
import entity.Type;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
 * TypeDaoImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/24/2018</pre>
 */
public class TypeDaoImplTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    /**
     * Method: getById(Integer id)
     */
    @Test
    public void testGetById() throws Exception {
        Type type = new TypeDaoImpl().getById(1);
        System.out.println(type);
    }

    /**
     * Method: getAll()
     */
    @Test
    public void testGetAll() throws Exception {
        List<Type> typeList = new TypeDaoImpl().getAll();
        for (Type type : typeList) {
            System.out.println(type);
        }
//TODO: Test goes here... 
    }


} 
