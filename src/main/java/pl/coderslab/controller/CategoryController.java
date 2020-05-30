package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import pl.coderslab.entity.Category;
import pl.coderslab.repository.CategoryRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("category")
public class CategoryController {
//
//    private final CategoryDao categoryDao;
//
//    public CategoryController(CategoryDao categoryDao) {
//        this.categoryDao = categoryDao;
//    }

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @ModelAttribute("categories")
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();

//        return categoryDao.findAll();
    }


    @GetMapping("/show")
    public String findAll() {
        return "category/show";
    }


    @GetMapping("/add")
    public String addCategory(Model model) {
        model.addAttribute("category", new Category());
        return "category/add";
    }


    @PostMapping("/add")
    public String saveCategory(@Valid Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "category/add";
        }

        categoryRepository.save(category);
//        categoryDao.saveCategory(category);
        return "redirect:/category/show";
    }


    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) throws Exception {
        Optional<Category> byId = categoryRepository.findById(id);
        Category category = byId.orElseThrow(Exception::new);


        model.addAttribute("category", category);
//        model.addAttribute("category", categoryDao.findById(id));
        return "category/edit";
    }

    @PostMapping(value = "/edit/{id}")
    public String update(@Valid Category category, BindingResult result, @PathVariable Long id) throws Exception {
        if (result.hasErrors()) {
            return "category/edit";
        }

        Optional<Category> byId = categoryRepository.findById(id);
        Category categoryInDB = byId.orElseThrow(Exception::new);


//        Category categoryInDB = categoryDao.findById(id);
        categoryInDB.setDescription(category.getDescription());
        categoryInDB.setName(category.getName());

        categoryRepository.save(categoryInDB);
//        categoryDao.update(categoryInDB);
        return "redirect:/category/show";
    }


    @GetMapping("/delete/{id}")
    public String question(@PathVariable Long id) {

        categoryRepository.deleteById(id);

//        categoryDao.delete(categoryDao.findById(id));
        return "redirect:/category/show";
    }
}
