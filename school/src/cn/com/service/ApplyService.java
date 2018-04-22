package cn.com.service;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.Apply;

public interface ApplyService {
	public void insertApply(Apply apply);
	public void deleteApply(Serializable id);
	public Apply selectApply(Serializable id);
	public List<Apply> selectApply(String isMessage);
}
