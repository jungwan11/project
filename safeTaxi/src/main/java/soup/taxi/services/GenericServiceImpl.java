package soup.taxi.services;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import soup.taxi.mapper.GenericMapper;

public class GenericServiceImpl<E, ID, M extends GenericMapper<E,ID>> implements GenericService<E, ID>{

	private M mapper;
	@Inject
	public void setMapper(M mapper){
		this.mapper = mapper;
	}
	@Override
	public void ceate(E vo) throws Exception {
		// TODO Auto-generated method stub
		mapper.create(vo);
	}

	@Override
	public E read(ID key) throws Exception {
		// TODO Auto-generated method stub
		return mapper.read(key);
	}

	@Override
	public void update(E vo) throws Exception {
		// TODO Auto-generated method stub
		mapper.update(vo);
	}

	@Override
	public void delete(ID key) throws Exception {
		// TODO Auto-generated method stub
		mapper.delete(key);
	}

	@Override
	public Map<List<E>, ID> getList(ID pageno) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getList(pageno);
	}

}
