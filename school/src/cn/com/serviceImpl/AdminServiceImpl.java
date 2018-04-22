package cn.com.serviceImpl;

import cn.com.dao.AdminDao;
import cn.com.entity.Admin;
import cn.com.service.AdminService;

public class AdminServiceImpl implements AdminService {
	AdminDao adminDao;
	
	/**
	 * @param adminDao the adminDao to set
	 */
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public Admin login(Admin admin) {
		return adminDao.login(admin);
	}

}
