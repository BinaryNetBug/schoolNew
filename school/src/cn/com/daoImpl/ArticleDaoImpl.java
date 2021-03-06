package cn.com.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.dao.ArticleDao;
import cn.com.entity.Article;

public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {

	@Override
	public void insertArticle(Article article) {
		this.getHibernateTemplate().save(article);
	}

	@Override
	public void deleteArticle(Serializable articleId) {
		this.getHibernateTemplate().delete(this.selectArticle(articleId));
	}

	@Override
	public void updateArticle(Article article) {
		this.getHibernateTemplate().update(article);
	}

	@Override
	public List<Article> selectArticle() {
		@SuppressWarnings("unchecked")
		List<Article> articleList = (List<Article>) this.getHibernateTemplate().find("from Article");
		System.out.println(articleList);
		return articleList.size()>0?articleList:null;
	}

	@Override
	public Article selectArticle(Serializable articleId) {
		Article article = this.getHibernateTemplate().get(Article.class, articleId);
		return article;
	}

	@Override
	public List<Article> selectArticle(Integer typeId) {
		@SuppressWarnings("unchecked")
		List<Article> articleList = (List<Article>) this.getHibernateTemplate().find("from Article where typeId=?", typeId);
		return articleList.size()>0?articleList:null;
	}

}
