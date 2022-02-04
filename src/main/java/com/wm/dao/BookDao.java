package com.wm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wm.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: wenming
 * @Description:
 * @date: 2022/1/30-1:45
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
