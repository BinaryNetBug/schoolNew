package cn.com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.dao.TypeDao;
import cn.com.entity.Type;

public class TypeDaoImpl extends HibernateDaoSupport implements TypeDao{

	@Override
	public void insertType(Type type) {
		this.getHibernateTemplate().save(type);
	}
	@Override
	public void deleteType(Integer typeId) {
		this.getHibernateTemplate().delete(this.selectType(typeId));
	}
	@Override
	public void updateType(Type type) {
		this.getHibernateTemplate().update(type);
	}
	@Override
	public List<Type> selectType() {
		List<Type> typeList = (List<Type>) this.getHibernateTemplate().find("from Type", null);
		return typeList;
	}
	@Override
	public Type selectType(Integer typeId) {
		return (Type) this.getHibernateTemplate().find("from Type where typeId = ?", typeId);
	}
}
