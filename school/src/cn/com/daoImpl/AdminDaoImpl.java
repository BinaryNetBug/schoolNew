package cn.com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.dao.AdminDao;
import cn.com.entity.Admin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao
{ 
	@SuppressWarnings("unchecked")
	@Override
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		String[] values = {admin.getAdminName(),admin.getPassword()};
		List<Admin> adminList = (List<Admin>) this.getHibernateTemplate().find("from Admin where adminName = ? and password = ?",values);
		return adminList.size()>0?adminList.get(0):null;
	}

}
