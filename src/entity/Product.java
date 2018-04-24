package entity;

/**
 * 商品类
 */
public class Product {
    private Integer p_id;
    private String p_name;
    private String p_description;
    private Double price;
    private Integer stock;      //库存
    private Integer p_count;    //热卖程度
    private Integer a_type_id;
    private Integer a_super_type_id;
    private String filepath;

    public Product() {
    }

    public Product(Integer p_id, String p_name, String p_description, Double price, Integer stock, Integer p_count, Integer a_type_id, Integer a_super_type_id, String filepath) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_description = p_description;
        this.price = price;
        this.stock = stock;
        this.p_count = p_count;
        this.a_type_id = a_type_id;
        this.a_super_type_id = a_super_type_id;
        this.filepath = filepath;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_description() {
        return p_description;
    }

    public void setP_description(String p_description) {
        this.p_description = p_description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getP_count() {
        return p_count;
    }

    public void setP_count(Integer p_count) {
        this.p_count = p_count;
    }

    public Integer getA_type_id() {
        return a_type_id;
    }

    public void setA_type_id(Integer a_type_id) {
        this.a_type_id = a_type_id;
    }

    public Integer getA_super_type_id() {
        return a_super_type_id;
    }

    public void setA_super_type_id(Integer a_super_type_id) {
        this.a_super_type_id = a_super_type_id;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "Product{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_description='" + p_description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", p_count=" + p_count +
                ", a_type_id=" + a_type_id +
                ", a_super_type_id=" + a_super_type_id +
                ", filepath='" + filepath + '\'' +
                '}';
    }
}
