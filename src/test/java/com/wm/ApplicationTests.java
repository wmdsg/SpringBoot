package com.wm;

import com.wm.domain.Book;
import com.wm.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private IBookService iBookService;
	@Test
	void contextLoads() {
		List<Book> list = iBookService.list();
		list.forEach(System.out::println);
	}

}
