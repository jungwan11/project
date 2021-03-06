package soup.taxi.services;

import java.util.List;
import java.util.Map;

public interface GenericService<E, ID> {

	public void ceate(E vo)throws Exception;
	public E read(ID key)throws Exception;
	public void update(E vo)throws Exception;
	public void delete(ID key)throws Exception;
	public Map<List<E>, ID> getList(ID pageno)throws Exception;
	
}
