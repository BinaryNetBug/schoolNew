package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.Article;

public interface ArticleDao {
	public void insertArticle(Article article);
	public void deleteArticle(Serializable articleId);
	public void updateArticle(Article article);
	public List<Article> selectArticle();
	public Article selectArticle(Serializable articleId);
	public List<Article> selectArticle(Integer typeId);
}
