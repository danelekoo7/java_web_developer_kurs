//package pl.coderslab.dao;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//import pl.coderslab.entity.Article;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import java.util.List;
//
//@Repository
//@Transactional
//public class ArticleDao {
//
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public void saveArticle(Article article) {
//        entityManager.persist(article);
//    }
//
//    public void update(Article article) {
//        entityManager.merge(article);
//    }
//
//    public Article findById(Long id) {
//        return entityManager.find(Article.class, id);
//    }
//
//    public List<Article> findAll() {
//        Query query = entityManager.createQuery("SELECT a FROM Article a");
//        List<Article> articles = query.getResultList();
//        return articles;
//    }
//
//    public List<Article> findAllDraft() {
//        Query query = entityManager.createQuery("SELECT a FROM Article  a WHERE  a.draft=true ");
//        List<Article> articles = query.getResultList();
//        return articles;
//    }
//
//    public List<Article> findLastFiveArticles() {
//        Query query = entityManager.createQuery("SELECT a FROM Article a ORDER BY a.created DESC");
//        query.setMaxResults(5);
//        List<Article> articles = query.getResultList();
//        return articles;
//    }
//
//
//    public void delete(Article article) {
//        entityManager.remove(entityManager.contains(article) ?
//                article : entityManager.merge(article));
//    }
//}
