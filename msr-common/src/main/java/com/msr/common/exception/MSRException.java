package com.msr.common.exception;

import com.msr.common.constants.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hutengfei
 * @version V1.0
 * @Package com.msr.common.exception
 * @date 2020/6/8 17:13
 * @Copyright © 株式会社多言语系统研究所
 */
@Data
@ApiModel(value = "全局异常")
public class MSRException extends RuntimeException {
    @ApiModelProperty(value = "状态码")
    private Integer code;

    /**
     * 接收状态码和消息
     * @param code
     * @param message
     */

    public MSRException(Integer code,String message){
        super(message);
        this.code=code;
    }

    /**
     * 接收枚举类型
     * @param resultCodeEnum
     */

    public MSRException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }
    @Override
    public String toString() {
        return "MSRException{" +
                "message=" + this.getMessage() +
                ", code=" + code +
                '}';
    }

}
