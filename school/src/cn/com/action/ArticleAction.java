package cn.com.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.Article;
import cn.com.service.ArticleService;
import cn.com.service.TypeService;

public class ArticleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Article article;
	private File image;
	private String imageFileName;
	private ArticleService articleService;
	private TypeService typeService;
	private List<Article> articleList;
	private String editorValue;
	private boolean flag = false;
	
	
	
	
	
	
	
	
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
	 * @return the flag
	 */
	public boolean isFlag() {
		return flag;
	}
	/**
	 * @return the articleList
	 */
	public List<Article> getArticleList() {
		return articleList;
	}
	/**
	 * @param articleList the articleList to set
	 */
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	/**
	 * @param typeService the typeService to set
	 */
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	/**
	 * @param articleService the articleService to set
	 */
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}
	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}
	/**
	 * @return the image
	 */
	public File getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(File image) {
		this.image = image;
	}
	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}
	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	/**
	 * @param article
	 * @param image
	 * @param imageFileName
	 */
	public ArticleAction(Article article, File image, String imageFileName) {
		super();
		this.article = article;
		this.image = image;
		this.imageFileName = imageFileName;
	}
	/**
	 * 
	 */
	public ArticleAction() {
		super();
	}
	
	public String uploadImageArticle(){
		String path = ServletActionContext.getServletContext().getRealPath("/images");
		String fileName = System.currentTimeMillis()+"_"+imageFileName;
		try {
			FileUtils.copyFile(image, new File(path,fileName));
			imageFileName = fileName;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String insertArticle(){
		this.article.setType(this.typeService.selectType(this.article.getType().getTypeId()));
		this.articleService.insertArticle(article);
		return SUCCESS;
	}
	
	public String selectArticle(){
		this.articleList = this.articleService.selectArticle();
		return SUCCESS;
	}
	
	public String selectOneArticle(){
		this.article = this.articleService.selectArticle(article.getArticleId());
		return SUCCESS;
	}
	
	public String deleteArticle(){
		this.articleService.deleteArticle(article.getArticleId());
		this.flag = true;
		return SUCCESS;
	}

	public String selectTypeArticle(){
		this.articleList = (List<Article>) this.articleService.selectTypeArticle(this.article.getType().getTypeId());
		return SUCCESS;
	}
	
	public String updateArticle(){
		this.article.setType(this.typeService.selectType(this.article.getType().getTypeId()));
		this.articleService.updateArticle(article);
		return SUCCESS;
	}
}
