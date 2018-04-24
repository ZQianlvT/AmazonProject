package entity;

/**
 * 商品类别类
 */
public class Type {
    private Integer type_id;
    private String type_name;
    private Integer super_type_id;

    public Type() {
    }

    public Type(Integer type_id, String type_name, Integer super_type_id) {
        this.type_id = type_id;
        this.type_name = type_name;
        this.super_type_id = super_type_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Integer getSuper_type_id() {
        return super_type_id;
    }

    public void setSuper_type_id(Integer super_type_id) {
        this.super_type_id = super_type_id;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type_id=" + type_id +
                ", type_name='" + type_name + '\'' +
                ", super_type_id=" + super_type_id +
                '}';
    }
}
