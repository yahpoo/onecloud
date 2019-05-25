package xyz.yahpoo.onespc.common.enums;

import lombok.Getter;

@Getter
public enum StatusEnum {

    YES("Y", "可用"),
    NO("N", "未删除"),
    ;

    private String code;
    private String msg;

    StatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
