package bookmall.dao.test;

import bookmall.dao.OrderDao;
import bookmall.vo.MemberVo;
import bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
//		insertTest();  -- 성공
	}

	private static void insertTest() {
		OrderVo vo = null;
		OrderDao dao = new OrderDao();
		
		vo = new OrderVo();
		vo.setOrders_number("2021101401");
		vo.setMember_no(1L);
		vo.setAddress("대구북구");
		vo.setFinal_price(56000);
		dao.insert(vo);
	}

}
