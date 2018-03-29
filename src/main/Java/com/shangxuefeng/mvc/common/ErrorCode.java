package com.shangxuefeng.mvc.common;

import lombok.Setter;

/**
 * @author shangxuefeng @date 2018/3/29
 */
public enum ErrorCode {
    SUCCESS("成功", 0),
    RPC_FAIL("rpc调用失败", 1),
    PARAM_ERROR("参数错误", 2)
    ;
    private String desc;
    private int code;

     ErrorCode(String desc, int code){
        this.desc = desc;
        this.code = code;
    }
}
