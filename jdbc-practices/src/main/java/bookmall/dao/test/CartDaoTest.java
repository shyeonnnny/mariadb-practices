package bookmall.dao.test;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
//		insertTest();
	}

	private static void insertTest() {
		CartVo vo = null;
		CartDao dao = new CartDao();
		
		vo = new CartVo();
		vo.setMember_no(1L);
		vo.setBook_no(2L);
		vo.setCount(3);
		
		dao.insert(vo);
	}

}
