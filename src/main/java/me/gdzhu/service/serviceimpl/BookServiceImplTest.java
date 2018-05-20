package me.gdzhu.service.serviceimpl;

import me.gdzhu.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import me.gdzhu.dto.AppointExecution;
import me.gdzhu.service.BookService;

/**
 * Created by ZhuGuodong on 2018/5/19 16:15
 * Description:
 */
public class BookServiceImplTest extends BaseTest{
    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }
}
