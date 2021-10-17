package bookmall.vo;

public class CategoryVo {
	private Long no;
	private String category_title;

	public String getCategory_title() {
		return category_title;
	}

	public void setCategory_title(String category_title) {
		this.category_title = category_title;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", 카테고리=" + category_title + "]";
	}
	
	
}
