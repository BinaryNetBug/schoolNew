package cn.com.entity;

import java.io.Serializable;

public class Major implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer majorId;//专业id 主键
	private String mName;//专业名称
	private String article;//专业介绍
	private String intro;//专业简介
	/**
	 * @return the majorId
	 */
	public Integer getMajorId() {
		return majorId;
	}
	/**
	 * @param majorId the majorId to set
	 */
	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}
	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}
	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}
	/**
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}
	/**
	 * @param article the article to set
	 */
	public void setArticle(String article) {
		this.article = article;
	}
	/**
	 * @return the intro
	 */
	public String getIntro() {
		return intro;
	}
	/**
	 * @param intro the intro to set
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}
	/**
	 * @param majorId
	 * @param mName
	 * @param article
	 * @param intro
	 */
	public Major(Integer majorId, String mName, String article, String intro) {
		super();
		this.majorId = majorId;
		this.mName = mName;
		this.article = article;
		this.intro = intro;
	}
	/**
	 * 
	 */
	public Major() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Major [majorId=" + majorId + ", mName=" + mName + ", article=" + article + ", intro=" + intro + "]";
	}
	
	

}
