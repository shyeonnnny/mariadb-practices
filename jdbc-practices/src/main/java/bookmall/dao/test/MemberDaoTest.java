package bookmall.dao.test;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
//		insertTest();  -- 성공
	}

	private static void insertTest() {
		MemberVo vo = null;
		MemberDao dao = new MemberDao();
		
		vo = new MemberVo();
		vo.setName("라이언");
		vo.setPhone("01012345678");
		vo.setEmail("lion@gmail.com");
		vo.setPassword("1234");
		dao.insert(vo);
	}

}
