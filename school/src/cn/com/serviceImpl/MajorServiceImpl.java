package cn.com.serviceImpl;

import java.io.Serializable;
import java.util.List;

import cn.com.dao.MajorDao;
import cn.com.entity.Major;
import cn.com.service.MajorService;

public class MajorServiceImpl implements MajorService {
	MajorDao majorDao;
	
	
	/**
	 * @param majorDao the majorDao to set
	 */
	public void setMajorDao(MajorDao majorDao) {
		this.majorDao = majorDao;
	}

	@Override
	public void insertMajor(Major major) {
		this.majorDao.insertMajor(major);
	}

	@Override
	public void deleteMajor(Serializable majorId) {
		this.majorDao.deleteMajor(majorId);
	}

	@Override
	public void updateMajor(Major major) {
		this.majorDao.updateMajor(major);
	}

	@Override
	public List<Major> selectMajor() {
		return this.majorDao.selectMajor();
	}

	@Override
	public Major selectMajor(Serializable majorId) {
		return this.majorDao.selectMajor(majorId);
	}

}
