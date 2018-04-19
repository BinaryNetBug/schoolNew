package cn.com.entity;

import java.io.Serializable;

public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer articleId;//主键
	private String title;//标题
	private String author;//作者
	private String time;//发布时间
	private Type type;//文章类型
	private String intro;//文章简介
	private String image;//文章封面图
	private String context;//文章内容
	/**
	 * @return the articleId
	 */
	public Integer getArticleId() {
		return articleId;
	}
	/**
	 * @param articleId the articleId to set
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
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
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}
	/**
	 * @param context the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}
	/**
	 * @param articleId
	 * @param title
	 * @param author
	 * @param time
	 * @param type
	 * @param intro
	 * @param image
	 * @param context
	 */
	public Article(Integer articleId, String title, String author, String time, Type type, String intro, String image,
			String context) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.author = author;
		this.time = time;
		this.type = type;
		this.intro = intro;
		this.image = image;
		this.context = context;
	}
	/**
	 * 
	 */
	public Article() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", author=" + author + ", time=" + time
				+ ", type=" + type + ", intro=" + intro + ", image=" + image + ", context=" + context + "]";
	}
	
	
	

	
}
