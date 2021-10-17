package bookmall.dao.test;

import java.util.List;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
		insertTest();
		fineAll();
	}

	public static void fineAll() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		CartVo vo = null;
		CartDao dao = new CartDao();
		
		vo = new CartVo();
		vo.setMember_no(1L);
		vo.setBook_no(2L);
		vo.setCount(3);
		dao.insert(vo);
		
	
		vo.setMember_no(2L);
		vo.setBook_no(3L);
		vo.setCount(4);
		dao.insert(vo);
		
	}

}
