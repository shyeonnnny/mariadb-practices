package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;
import bookshop.dao.AuthorDao;
import bookshop.vo.AuthorVo;

public class BookDaoTest {

	public static void main(String[] args) {
//		insertTest(); -- 성공
		findAllTest();
	}

	private static void findAllTest() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setBook_title("어린왕자");
		vo.setBook_price(18000);
		dao.insert(vo);
	}

}
