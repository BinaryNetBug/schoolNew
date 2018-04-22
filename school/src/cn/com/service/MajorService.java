package cn.com.service;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.Major;

public interface MajorService {
	public void insertMajor(Major major);
	public void deleteMajor(Serializable majorId);
	public void updateMajor(Major major);
	public List<Major> selectMajor();
	public Major selectMajor(Serializable majorId);
}
