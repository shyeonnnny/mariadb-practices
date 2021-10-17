package bookmall.vo;

public class OrderBookVo {
	private int book_count;
	private int book_no;
	private int orders_no;
	
	public int getBook_count() {
		return book_count;
	}
	public void setBook_count(int book_count) {
		this.book_count = book_count;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public int getOrders_no() {
		return orders_no;
	}
	public void setOrders_no(int orders_no) {
		this.orders_no = orders_no;
	}
	@Override
	public String toString() {
		return "OrderBookVo [주문번호=" + orders_no + ", 책번호=" + book_no + ", 구매갯수=" + book_count + "]";
	}
	
	

}
