package com.wm.controller.uitls;

import lombok.Data;

/**
 * @author: wenming
 * @Description:
 * @date: 2022/1/30-14:54
 */


//前后端数据协议
@Data
public class R {

    private boolean flag;
    private Object data;
    private String msg;

    public R(){}
    public R(boolean flag){
        this.flag=flag;
    }

    public R(boolean flag,Object data){
        this.flag=flag;
        this.data=data;
    }

    public R(boolean flag,String msg){
        this.flag=flag;
        this.msg=msg;
    }
}
