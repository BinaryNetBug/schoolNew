package cn.com.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.dao.MajorDao;
import cn.com.entity.Major;

public class MajorDaoImpl extends HibernateDaoSupport implements MajorDao {

	@Override
	public void insertMajor(Major major) {
		this.getHibernateTemplate().save(major);
	}

	@Override
	public void deleteMajor(Serializable majorId) {
		this.getHibernateTemplate().delete(this.selectMajor(majorId));
	}

	@Override
	public void updateMajor(Major major) {
		this.getHibernateTemplate().update(major);
	}

	@Override
	public List<Major> selectMajor() {
		List<Major> majorList = (List<Major>) this.getHibernateTemplate().find("from Major",null);
		return majorList.size()>0?majorList:null;
	}

	@Override
	public Major selectMajor(Serializable majorId) {
		return (Major) this.getHibernateTemplate().find("from Major where majorId=?", majorId);
	}

}
