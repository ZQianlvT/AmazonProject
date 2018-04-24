package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;

/**
 * JDBC工具类
 * @author Orion Pax
 */
public class JdbcUtil {
    //加载src目录下的c3p0配置文件
    private static DataSource dataSource = new ComboPooledDataSource();
    private static QueryRunner queryRunner;

    /**
     * 获取数据源
     * @return 数据源
     */
    public static DataSource getDataSource(){
        return dataSource;
    }

    /**
     * 获取QueryRunner对象
     * @return QueryRunner对象
     */
    public static QueryRunner getQueryRunner(){
        if(queryRunner==null){
            queryRunner = new QueryRunner(dataSource);
        }
        return queryRunner;
    }
}
