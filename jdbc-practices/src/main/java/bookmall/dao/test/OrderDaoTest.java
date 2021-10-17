package bookmall.dao.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.dao.OrderDao;
import bookmall.vo.MemberVo;
import bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
		insertTest();
		findAll();
	}

	public static void findAll() {
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
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
