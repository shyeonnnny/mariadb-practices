package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		insertTest();
		fineAll();

	}

	public static void fineAll() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setCategory_no(1L);
		vo.setBook_title("이것이 자바다");
		vo.setBook_price(28000);
		dao.insert(vo);
		
		vo.setCategory_no(2L);
		vo.setBook_title("어린왕자");
		vo.setBook_price(18000);
		dao.insert(vo);
		
		vo.setCategory_no(3L);
		vo.setBook_title("경제학");
		vo.setBook_price(14000);
		dao.insert(vo);
	}

}
