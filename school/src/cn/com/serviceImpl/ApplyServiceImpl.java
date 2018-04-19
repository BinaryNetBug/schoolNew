package cn.com.serviceImpl;

import java.io.Serializable;
import java.util.List;

import cn.com.dao.ApplyDao;
import cn.com.entity.Apply;
import cn.com.service.ApplyService;

public class ApplyServiceImpl implements ApplyService{
  private ApplyDao ApplyDao;
  
	public void setApplyDao(ApplyDao applyDao) {
	    this.ApplyDao = applyDao;
}

	@Override
	public void addApply(Apply apply) {
	this.ApplyDao.save(apply);
		
	}

	@Override
	public void deleteApply(Serializable id) {
		this.ApplyDao.delete(id);
		
	}

	@Override
	public Apply findbyApply(Serializable id) {
		
		return this.ApplyDao.findbyid(id);
	}

	@Override
	public List<Apply> findallApply() {
		
		return this.ApplyDao.findall();
	}

}
