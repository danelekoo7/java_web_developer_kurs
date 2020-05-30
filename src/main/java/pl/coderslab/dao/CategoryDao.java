//package pl.coderslab.dao;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//import pl.coderslab.entity.Category;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import java.util.List;
//
//@Repository
//@Transactional
//public class CategoryDao {
//
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public void saveCategory(Category category) {
//        entityManager.persist(category);
//    }
//
//    public void update(Category category) {
//        entityManager.merge(category);
//    }
//
//    public Category findById(Long id) {
//        return entityManager.find(Category.class, id);
//    }
//
//
//    public List<Category> findAll() {
//        Query query = entityManager.createQuery("SELECT c FROM Category c");
//        List<Category> categories = query.getResultList();
//        return categories;
//    }
//
//    public void delete(Category category) {
//        entityManager.remove(entityManager.contains(category) ?
//                category : entityManager.merge(category));
//    }
//
//}
