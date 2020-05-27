package com.demo.domain.persistence.entity.common.enums;

public enum OperationTypeEnum {
    INSERT(0,"新增"),
    DELETE(1,"删除"),
    UPDATE(2,"修改"),
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
