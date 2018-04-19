package cn.com.serviceImpl;

import java.util.List;

import cn.com.dao.TypeDao;
import cn.com.entity.Type;
import cn.com.service.TypeService;

public class TypeServiceImpl implements TypeService {
	private TypeDao dao;
	public void setDao(TypeDao dao) {
		this.dao = dao;
	}
	@Override
	public void insertType(Type type) {
		this.dao.insertType(type);
	}
	@Override
	public void deleteType(Integer typeId) {
		this.dao.deleteType(typeId);
	}
	@Override
	public void updateType(Type type) {
		this.dao.updateType(type);
	}
	@Override
	public List<Type> selectType() {
		return this.dao.selectType();
	}
	@Override
	public Type selectType(Integer typeId) {
		return this.dao.selectType(typeId);
	}
}
