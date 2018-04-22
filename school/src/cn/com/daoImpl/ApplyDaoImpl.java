package cn.com.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.dao.ApplyDao;
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Apply> findMessage(String isMessage) {
		List<Apply> applyList = (List<Apply>) this.getHibernateTemplate().find("from Apply where isMessage=?", isMessage);
		return applyList.size()>0?applyList:null;
	}

}
