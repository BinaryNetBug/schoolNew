package cn.com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.Major;
import cn.com.service.MajorService;

public class MajorAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Major> majorList;
	private int flag;
	private Major major;
	private MajorService majorService;
	private String editorValue;
	
	
	
	/**
	 * @return the editorValue
	 */
	public String getEditorValue() {
		return editorValue;
	}
	/**
	 * @param editorValue the editorValue to set
	 */
	public void setEditorValue(String editorValue) {
		this.editorValue = editorValue;
	}
	/**
	 * @param majorService the majorService to set
	 */
	public void setMajorService(MajorService majorService) {
		this.majorService = majorService;
	}
	/**
	 * @return the majorList
	 */
	public List<Major> getMajorList() {
		return majorList;
	}
	/**
	 * @param majorList the majorList to set
	 */
	public void setMajorList(List<Major> majorList) {
		this.majorList = majorList;
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
	/**
	 * @return the major
	 */
	public Major getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(Major major) {
		this.major = major;
	}
	
	public String insertMajor(){
		this.major.setArticle(editorValue);
		this.majorService.insertMajor(major);
		return SUCCESS;
	}
	public String deleteMajor(){
		this.majorService.deleteMajor(major.getMajorId());
		this.flag = 1;
		return SUCCESS;
	}
	public String updateMajor(){
		major.setArticle(editorValue);
		this.majorService.updateMajor(major);
		return SUCCESS;
	}
	public String selectMajor(){
		this.majorList = this.majorService.selectMajor();
		return SUCCESS;
	}
	public String selectOneMajor(){
		System.out.println(major.getMajorId());
		this.major = this.majorService.selectMajor(this.major.getMajorId());
		System.out.println(major);
		return SUCCESS;
	}
}
