package com.wm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wm.domain.Book;
import java.util.List;

/**
 * @author: wenming
 * @Description:
 * @date: 2022/1/30-2:03
 */
public interface BookService {

    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage,int PageSize);
}
