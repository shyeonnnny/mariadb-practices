package bookmall.dao.test;

import bookmall.dao.CategoryDao;
import bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		insertTest();
	}

	private static void insertTest() {
		CategoryVo vo = null;
		CategoryDao dao = new CategoryDao();
		
		vo = new CategoryVo();
		vo.setCategory_title("소설");
		dao.insert(vo);
	}

}
