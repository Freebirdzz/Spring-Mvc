package com.shangxuefeng.mvc.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * @author shangxuefeng @date 2018/3/29
 */
@Setter
@Getter
@ToString
public class GetObjectRequest {
    @NotBlank(message = "电话不能为空")
    private String mobile;

    private Integer id;
}
