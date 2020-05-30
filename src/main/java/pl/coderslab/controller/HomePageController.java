package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.coderslab.entity.Article;
import pl.coderslab.entity.Category;
import pl.coderslab.repository.ArticleRepository;
import pl.coderslab.repository.CategoryRepository;

import java.util.List;


@Controller
public class HomePageController {

//    private final ArticleDao articleDao;

    private final ArticleRepository articleRepository;
    private final CategoryRepository categoryRepository;

    public HomePageController(ArticleRepository articleRepository, CategoryRepository categoryRepository) {
        this.articleRepository = articleRepository;
        this.categoryRepository = categoryRepository;
    }


    @GetMapping
    public String home(Model model) {
        List<Category> categories = categoryRepository.findAll();

        List<Article> articles = articleRepository.findFirst5ByOrderByCreatedDesc();
//        List<Article> articles = articleDao.findLastFiveArticles();

        model.addAttribute("articles", articles);
        model.addAttribute("categories", categories);
        return "home";
    }
}
