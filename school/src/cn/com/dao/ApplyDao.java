package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.Apply;


public interface ApplyDao {
	public void save(Apply apply);
	public void delete(Serializable id);
	public Apply  findbyid(Serializable id);
	public List<Apply> findall();
}
