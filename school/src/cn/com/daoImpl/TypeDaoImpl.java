package cn.com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.com.dao.TypeDao;
import cn.com.entity.Type;

public class TypeDaoImpl implements TypeDao{
	private HibernateTemplate hibernateTemplate;
	
	
	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void insertType(Type type) {
		this.hibernateTemplate.save(type);
	}

	@Override
	public void deleteType(Integer typeId) {
		this.hibernateTemplate.delete(this.selectType(typeId));
	}

	@Override
	public void updateType(Type type) {
		this.hibernateTemplate.update(type);
	}

	@Override
	public List<Type> selectType() {
		List<Type> typeList = (List<Type>) this.hibernateTemplate.find("from Type", null);
		return typeList;
	}

	@Override
	public Type selectType(Integer typeId) {
		return (Type) this.hibernateTemplate.find("from Type where typeId = ?", typeId);
	}

}
