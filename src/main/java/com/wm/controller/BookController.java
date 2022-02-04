package com.wm.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wm.controller.uitls.R;
import com.wm.domain.Book;
import com.wm.service.IBookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: wenming
 * @Description:
 * @date: 2022/1/30-13:53
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private static Class clazz;

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public R getAll(){
        return new R(true,iBookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book){
        boolean flag = iBookService.save(book);
        return new R(flag,flag?"添加成功(*^▽^*)":"添加失败o(╥﹏╥)o");
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(iBookService.modify(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable("id") Integer id){
        return new R(iBookService.delete(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable("id") Integer id){
//        if (true) throw new NumberFormatException("数据");

        return new R(true,iBookService.getById(id));
    }

    @GetMapping("/{currentPage}/{PageSize}")
    public R getPage(@PathVariable("currentPage") int currentPage,@PathVariable("PageSize") int PageSize,Book book){
        IPage<Book> page = iBookService.getPage(currentPage, PageSize,book);
        if (currentPage>page.getPages()){
            page=iBookService.getPage((int)page.getPages(), PageSize,book);
        }
        return new R(null!=page,page);
    }
}
