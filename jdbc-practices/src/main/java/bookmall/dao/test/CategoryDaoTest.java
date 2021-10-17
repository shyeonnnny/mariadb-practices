package bookmall.dao.test;

import java.util.List;

import bookmall.dao.CategoryDao;
import bookmall.dao.MemberDao;
import bookmall.vo.CategoryVo;
import bookmall.vo.MemberVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		insertTest();
		fineAll();
	}

	public static void fineAll() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for(CategoryVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		CategoryVo vo = null;
		CategoryDao dao = new CategoryDao();
		
		vo = new CategoryVo();
		vo.setCategory_title("컴퓨터/IT");
		dao.insert(vo);
		
		vo.setCategory_title("소설");
		dao.insert(vo);
		
		vo.setCategory_title("경제");
		dao.insert(vo);
	}

}
