package cn.com.service;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.Apply;

public interface ApplyService {
public void addApply(Apply apply);
public void deleteApply(Serializable id);
public Apply findbyApply(Serializable id);
public List<Apply> findallApply();
}
