package bookmall.vo;

public class OrderVo {
	private Long no;
	private String orders_number;
	private Long member_no;
	private String address;
	private int final_price;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getOrders_number() {
		return orders_number;
	}
	public void setOrders_number(String orders_number) {
		this.orders_number = orders_number;
	}
	public Long getMember_no() {
		return member_no;
	}
	public void setMember_no(Long member_no) {
		this.member_no = member_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getFinal_price() {
		return final_price;
	}
	public void setFinal_price(int final_price) {
		this.final_price = final_price;
	}

	
	
	
}
