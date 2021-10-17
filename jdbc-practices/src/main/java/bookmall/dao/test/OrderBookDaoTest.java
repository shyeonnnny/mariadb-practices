package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderBookDao;
import bookmall.vo.OrderBookVo;

public class OrderBookDaoTest {

	public static void main(String[] args) {
		insertTest();
		findAll();
	}

	public static void findAll() {
		List<OrderBookVo> list = new OrderBookDao().findAll();
		for(OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		OrderBookVo vo = null;
		OrderBookDao dao = new OrderBookDao();
		
		vo = new OrderBookVo();
		vo.setOrders_no(1);
		vo.setBook_no(1);
		vo.setBook_count(2);
		dao.insert(vo);
		
//		vo.setOrders_no(2);
//		vo.setBook_no(2);
//		vo.setBook_count(5);
//		dao.insert(vo);
	}

}
