package com.wm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: wenming
 * @Description:
 * @date: 2022/1/30-1:38
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;

}
