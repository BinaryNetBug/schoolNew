package cn.com.action;

import java.util.List;

import cn.com.entity.Apply;
import cn.com.service.ApplyService;

public class ApplyAction {
private Apply apply;//封装表单数据 
private ApplyService applyService;//注入dao层的对象
private List<Apply> applyList;


public Apply getApply() {
	return apply;
}

public void setApply(Apply apply) {
	this.apply = apply;
}

public List<Apply> getApplyList() {
	return applyList;
}

public void setApplyList(List<Apply> applyList) {
	this.applyList = applyList;
}

	public String saveApply() {
		this.applyService.insertApply(apply);
		this.applyList = this.applyService.selectApply();
		return "success";
	}
	public String delApply(){
		this.applyService.deleteApply(apply.getApplyId());
		return "success";
	}
	public String fbyApply(){
		this.applyService.selectApply(apply.getApplyId());
		return "success";
	}
	public String finApply(){
		this.applyService.selectApply();
		return "success";
	}
}
