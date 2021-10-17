package bookmall.dao.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
		insertTest();
		findAll();
	}

	public static void findAll() {
		List<MemberVo> list = new MemberDao().findAll();
		for(MemberVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void insertTest() {
		MemberVo vo = null;
		MemberDao dao = new MemberDao();
		
		vo = new MemberVo();
		vo.setName("라이언");
		vo.setPhone("01012345678");
		vo.setEmail("lion@gmail.com");
		vo.setPassword("1234");
		dao.insert(vo);
		

		vo.setName("춘식이");
		vo.setPhone("01087654321");
		vo.setEmail("chunsik@gmail.com");
		vo.setPassword("5678");
		dao.insert(vo);
	}

}
