package com.wm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wm.domain.Book;

/**
 * @author: wenming
 * @Description:
 * @date: 2022/1/30-13:38
 */
public interface IBookService extends IService<Book> {

    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getPage(int currentPage,int PageSize);

    IPage<Book> getPage(int currentPage,int PageSize,Book book);
}
