package cn.com.service;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.Article;

public interface ArticleService {
	public void insertArticle(Article article);
	public void deleteArticle(Serializable articleId);
	public void updateArticle(Article article);
	public List<Article> selectArticle();
	public Article selectArticle(Serializable articleId);
}
