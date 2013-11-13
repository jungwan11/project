package soup.taxi.control;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import soup.taxi.mapper.ClientMapper;
import soup.taxi.vo.ClientVO;

public class mysqlTest {

	@Inject
	ClientMapper mapper;
	
	@Test
	public void test() {
		ClientVO vo = new ClientVO();
		vo.setUserid("testid");
		vo.setUsername("testname");
		vo.setUserpw("testpw");
		vo.setCellnumber(10010101);
		try {
			mapper.delete("userid03");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
