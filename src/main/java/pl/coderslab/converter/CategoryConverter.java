package pl.coderslab.converter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.entity.Category;
import pl.coderslab.repository.CategoryRepository;

import java.util.Optional;

public class CategoryConverter implements Converter<String, Category> {
//
//    @Autowired
//    private CategoryDao categoryDao;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category convert(String s) {

        Optional<Category> byId = categoryRepository.findById(Long.parseLong(s));
        Category category = null;
        try {
            category = byId.orElseThrow(Exception::new);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return category;
//        return categoryDao.findById(Long.parseLong(s));
    }
}
