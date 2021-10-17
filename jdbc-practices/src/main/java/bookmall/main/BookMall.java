package bookmall.main;

import bookmall.dao.test.BookDaoTest;
import bookmall.dao.test.CartDaoTest;
import bookmall.dao.test.CategoryDaoTest;
import bookmall.dao.test.MemberDaoTest;
import bookmall.dao.test.OrderBookDaoTest;
import bookmall.dao.test.OrderDaoTest;

public class BookMall {

	public static void main(String[] args) {
		
		MemberDaoTest.insertTest();
		CategoryDaoTest.insertTest();
		BookDaoTest.insertTest();
		CartDaoTest.insertTest();
		OrderDaoTest.insertTest();
		OrderBookDaoTest.insertTest();
		
		System.out.println("---------- (회원 리스트) ----------");
		MemberDaoTest.findAll();
		System.out.println();
		
		System.out.println("---------- (카테고리 리스트) ----------");
		CategoryDaoTest.fineAll();
		System.out.println();
		
		System.out.println("---------- (상품 리스트) ----------");
		BookDaoTest.fineAll();
		System.out.println();
		
		System.out.println("---------- (카트 리스트) ----------");
		CartDaoTest.fineAll();
		System.out.println();
		
		System.out.println("---------- (주문 리스트) ----------");
		OrderDaoTest.findAll();
		System.out.println();
		
		System.out.println("---------- (주문도서 리스트) ----------");
		OrderBookDaoTest.findAll();
		System.out.println();
	
	}

}
