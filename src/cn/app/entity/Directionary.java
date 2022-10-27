package cn.app.entity;

import java.util.Date;

public class Directionary {
    private String typeCode;
    private String typeName;
    private int valueId;
    private String valueName;
    private int createBy;

    public Directionary(String typeCode, String typeName, int valueId, String valueName, int createBy) {
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.valueId = valueId;
        this.valueName = valueName;
        this.createBy = createBy;
    }

    public Directionary() {}

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getValueId() {
        return valueId;
    }

    public void setValueId(int valueId) {
        this.valueId = valueId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "Directionary{" +
                "typeCode='" + typeCode + '\'' +
                ", typeName='" + typeName + '\'' +
                ", valueId=" + valueId +
                ", valueName='" + valueName + '\'' +
                ", createBy=" + createBy +
                '}';
    }
}
