package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.entity.Apply;

public class ApplyDaoImpl extends HibernateDaoSupport implements ApplyDao{

	@Override
	public void save(Apply apply) {
	this.getHibernateTemplate().save(apply);
		
	}

	@Override
	public void delete(Serializable id) {
		this.getHibernateTemplate().delete(findbyid(id));
	}

	@Override
	public Apply findbyid(Serializable id) {
		
		return this.getHibernateTemplate().get(Apply.class, id);
	}

	@Override
	public List<Apply> findall() {
		
		return (List<Apply>) this.getHibernateTemplate().find("form school", null);
	}

}
