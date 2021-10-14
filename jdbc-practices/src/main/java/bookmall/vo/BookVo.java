package bookmall.vo;

public class BookVo {
	private Long no;
	private String book_title;
	private int book_price;
	private Long category_no;
	
	public Long getCategory_no() {
		return category_no;
	}
	public void setCategory_no(Long category_no) {
		this.category_no = category_no;
	}
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	@Override
	public String toString() {
		return "BookVo [ book_title=" + book_title + ", book_price=" + book_price +" ]";
	}
	
	
	
	

}
