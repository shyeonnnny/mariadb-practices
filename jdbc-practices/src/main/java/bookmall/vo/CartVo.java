package bookmall.vo;

public class CartVo {
	private Long member_no;
	private Long book_no;
	private int count;
	
	
	public Long getMember_no() {
		return member_no;
	}
	public void setMember_no(Long member_no) {
		this.member_no = member_no;
	}
	public Long getBook_no() {
		return book_no;
	}
	public void setBook_no(Long book_no) {
		this.book_no = book_no;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
	
}
