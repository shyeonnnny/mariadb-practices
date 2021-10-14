package bookmall.dao.test;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
//		insertTest(); -- 성공

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
