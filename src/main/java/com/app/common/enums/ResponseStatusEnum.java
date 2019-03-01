package com.app.common.enums;

/**
 * @Package com.arrail.enums
 * @ClassName IsFirstEnum
 * @Author mengmeng.cao
 * @Date 2018/9/4 13:32
 * @Version 1.0
 * @Description: http状态码接口返回枚举
 **/
public enum ResponseStatusEnum {
    /**
     * http状态码接口返回枚举
     **/
    OK(200, "成功"),
    BAD_REQUEST(400, "请求异常"),
    UNAUTHORIZED(401, "没有认证或认证非法"),
    FORBIDDEN(403, "用户得到授权，但是访问是被禁止的"),
    UNPROCESSABLE_ENTITY(422, "校验错误"),
    TIME_INCORRECT(433, "时间格式不正确！"),
    INTERNAL_SERVER_ERROR(500, "服务器发生错误，请检查服务器"),
    COOPERATE_IS_NULL(550, "该护士无固定配台"),
    SCHEDULING_IS_NULL(555, "该医生本月没有排班！"),
    TEAM_NOT_DELETE(433, "当前资源有预约，不可移除！"),
    DATA_NOT_FOUND(404, "无数据"),
    DATA_IS_NULL(502, "无数据"),
    NUM_DEFICIENCY(503, "号源不足"),
    RESOURCE_NO_FIXED_COOPERATE(504, "该资源没有固定配台护士！"),
    DEPARTMENT_NAME_EXIST(560, "科室名称不可重复！"),
    DEPARTMENT_CLOSE(580, "科室不可关闭！"),
    CHAIR_NUMBER_ERROR(680, "椅位数量不能小于现有预约椅位数量！"),
    SAVE_CHAIR_NUMBER_ERROR(690, "修改椅位数量失败！"),
    SAVE_RULE_ERROR(691, "修改规则失败，与号源冲突！");

    private int code;

    private String value;

    ResponseStatusEnum() {
    }

    ResponseStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public static ResponseStatusEnum getCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ResponseStatusEnum u : ResponseStatusEnum.values()) {
            if (u.getCode() == code) {
                return u;
            }
        }
        return ResponseStatusEnum.OK;
    }
    public static String getValue(Integer code) {
        if (code == null) {
            return null;
        }
        for (ResponseStatusEnum u : ResponseStatusEnum.values()) {
            if (u.getCode() == code) {
                return u.getValue();
            }
        }
        return ResponseStatusEnum.OK.getValue();
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
