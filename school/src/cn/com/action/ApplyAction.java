package cn.com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.Apply;
import cn.com.service.ApplyService;

public class ApplyAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Apply apply;//封装表单数据 
	private ApplyService applyService;//注入dao层的对象
	private List<Apply> applyList;
	private int flag;

	/**
	 * @param applyService the applyService to set
	 */
	public void setApplyService(ApplyService applyService) {
		this.applyService = applyService;
	}
	
	/**
	 * @return the flag
	 */
	public int getFlag() {
		return flag;
	}
	
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
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

	public String insertApply() {
		this.applyService.insertApply(apply);
		return "success";
	}
	public String deleteApply(){
		this.applyService.deleteApply(apply.getApplyId());
		return "success";
	}
	public String selectOneApply(){
		this.applyService.selectApply(apply.getApplyId());
		return "success";
	}
	public String selectApply(){
		this.applyList = this.applyService.selectApply(this.apply.getIsMassage());;
		return "success";
	}
}
