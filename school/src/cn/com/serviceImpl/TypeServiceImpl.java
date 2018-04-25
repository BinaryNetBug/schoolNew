package cn.com.serviceImpl;

import java.io.Serializable;
import java.util.List;

import cn.com.dao.TypeDao;
import cn.com.entity.Type;
import cn.com.service.TypeService;

public class TypeServiceImpl implements TypeService {
	private TypeDao typeDao;
	
	
	/**
	 * @param typeDao the typeDao to set
	 */
	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

	@Override
	public void insertType(Type type) {
		this.typeDao.insertType(type);
	}

	@Override
	public void deleteType(Serializable typeId) {
		// TODO Auto-generated method stub
		this.typeDao.deleteType(typeId);

	}

	@Override
	public void updateType(Type type) {
		// TODO Auto-generated method stub
		this.typeDao.updateType(type);

	}

	@Override
	public List<Type> selectType() {
		// TODO Auto-generated method stub
		return this.typeDao.selectType();
	}

	@Override
	public Type selectType(Serializable typeId) {
		// TODO Auto-generated method stub
		System.out.println(typeDao);
		return this.typeDao.selectType(typeId);
	}

}
