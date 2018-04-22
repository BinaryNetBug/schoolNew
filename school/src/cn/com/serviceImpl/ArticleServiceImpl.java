package cn.com.serviceImpl;

import java.io.Serializable;
import java.util.List;

import cn.com.dao.ArticleDao;
import cn.com.entity.Article;
import cn.com.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	ArticleDao articleDao;
	
	
	/**
	 * @param articleDao the articleDao to set
	 */
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	@Override
	public void insertArticle(Article article) {
		this.articleDao.insertArticle(article);
	}

	@Override
	public void deleteArticle(Serializable articleId) {
		this.articleDao.deleteArticle(articleId);
	}

	@Override
	public void updateArticle(Article article) {
		this.articleDao.updateArticle(article);
	}
	@Override
	public List<Article> selectArticle() {
		return this.articleDao.selectArticle();
	}
	@Override
	public Article selectArticle(Serializable articleId) {
		return this.articleDao.selectArticle(articleId);
	}

}
