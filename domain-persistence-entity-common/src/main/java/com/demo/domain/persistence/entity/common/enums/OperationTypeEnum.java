package com.demo.domain.persistence.entity.common.enums;

public enum OperationTypeEnum {
    // 领域对象进行新增操作
    INSERT(0,"新增"),

    // 领域对象进行删除操作
    DELETE(1,"删除"),

    // 领域对象进行修改操作
    UPDATE(2,"修改"),

    // 领域对象进行查询操作
    SELECT(3,"查询"),
    ;


    private int code;
    private String msg;

    OperationTypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
