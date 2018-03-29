package com.shangxuefeng.mvc.common;

import com.shangxuefeng.mvc.bean.MyObject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author shangxuefeng @date 2018/3/29
 */
@Setter
@Getter
public class GetObjectResponse {
    private String message;
    private List<MyObject> data;
    private ErrorCode code;
}
