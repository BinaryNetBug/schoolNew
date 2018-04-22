package cn.com.service;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.Type;

public interface TypeService {
	public void insertType(Type type);
	public void deleteType(Serializable typeId);
	public void updateType(Type type);
	public List<Type> selectType();
	public Type selectType(Serializable typeId);
}
