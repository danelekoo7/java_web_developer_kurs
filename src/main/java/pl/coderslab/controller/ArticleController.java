package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import pl.coderslab.entity.Article;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Category;
import pl.coderslab.repository.ArticleRepository;
import pl.coderslab.repository.AuthorRepository;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.validation.ArticleValidationGroup;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("article")
public class ArticleController {

    //    private final ArticleDao articleDao;
//    private final AuthorDao authorDao;
//    private final CategoryDao categoryDao;
    private final ArticleRepository articleRepository;
    private final CategoryRepository categoryRepository;
    private final AuthorRepository authorRepository;

    public ArticleController(ArticleRepository articleRepository, CategoryRepository categoryRepository, AuthorRepository authorRepository) {
        this.articleRepository = articleRepository;
        this.categoryRepository = categoryRepository;
        this.authorRepository = authorRepository;
    }


    @GetMapping("/show")
    public String findAll() {
        return "article/show";
    }

    @GetMapping("/showFromCategory/{id}")
    public String findAllByCategory(@PathVariable Long id, Model model) throws Exception {

        Optional<Category> byId = categoryRepository.findById(id);
        Category category = byId.orElseThrow(Exception::new);

        List<Article> articles = articleRepository.findByCategories(category);


        model.addAttribute("articlesCat", articles);


        return "article/showCat";
    }


    @GetMapping("/add")
    public String addArticle(Model model) {
        model.addAttribute("article", new Article());
        return "article/add";
    }


    @PostMapping("/add")
    public String saveArticle(@Validated(ArticleValidationGroup.class) Article article, BindingResult result) {
        if (result.hasErrors()) {
            return "article/add";
        }
//        articleDao.saveArticle(article);
        articleRepository.save(article);
        return "redirect:/article/show";
    }


    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) throws Exception {
        Optional<Article> byId = articleRepository.findById(id);
        Article article = byId.orElseThrow(Exception::new);
//        model.addAttribute("article", articleDao.findById(id));
        model.addAttribute("article", article);
        return "article/edit";
    }

    @PostMapping(value = "/edit/{id}")
    public String update(@Validated(ArticleValidationGroup.class) Article article, BindingResult result, @PathVariable Long id) throws Exception {
        if (result.hasErrors()) {
            return "article/edit";
        }
        Optional<Article> byId = articleRepository.findById(id);
        Article articleInDB = byId.orElseThrow(Exception::new);

//        Article articleInDB = articleDao.findById(id);
        articleInDB.setUpdated(article.getUpdated());
        articleInDB.setTitle(article.getTitle());
        articleInDB.setCreated(article.getCreated());
        articleInDB.setContent(article.getContent());
        articleInDB.setCategories(article.getCategories());
        articleInDB.setAuthor(article.getAuthor());

//        articleDao.update(articleInDB);
        articleRepository.save(articleInDB);
        return "redirect:/article/show";
    }


    @GetMapping("/delete/{id}")
    public String question(@PathVariable Long id) throws Exception {
        Optional<Article> byId = articleRepository.findById(id);
        Article article = byId.orElseThrow(Exception::new);

        articleRepository.delete(article);
//        articleDao.delete(articleDao.findById(id));
        return "redirect:/article/show";
    }

    @ModelAttribute("articles")
    public List<Article> findAllArticles() {

        return articleRepository.findAll();
//        return articleDao.findAll();
    }

    @ModelAttribute("authors")
    public List<Author> findAllAuthors() {

        return authorRepository.findAll();
//        return authorDao.findAll();
    }

    @ModelAttribute("categories")
    public List<Category> findAllCategories() {

        return categoryRepository.findAll();
//        return categoryDao.findAll();
    }


//    First version
//    @GetMapping("/allArticles")
//    @ResponseBody
//    public List<Article> findAllArticles() {
//        return articleDao.findAll();
//    }
//
//
//    @RequestMapping("add")
//    @ResponseBody
//    public String add() {
//        Article article = new Article();
//        Article article = new Article();
//        Category category = new Category();
//
//        category.setName("IT");
//        category.setDescription("fajny artykul o javie");
//        categoryDao.saveCategory(category);
//
//        article.setFirstName("Daniel");
//        article.setLastName("Jed");
//        articleDao.saveArticle(article);
//
//        article.setArticle(article);
//        article.getCategories().add(category);
//        article.setContent("rozwoj");
//        article.setCreated(LocalDateTime.now());
//        article.setTitle("nowosci w java 14");
//        articleDao.saveArticle(article);
//
//        return "id dodanego artykulu to " + article.getId();
//    }
//
//    @RequestMapping("get/{id}")
//    @ResponseBody
//    public String getArticle(@PathVariable Long id) {
//        Article article = articleDao.findById(id);
//        return article.toString();
//    }
//
//    @RequestMapping("update/{id}/{title}")
//    @ResponseBody
//    public String updateArticle(@PathVariable Long id, @PathVariable String title) {
//        Article article = articleDao.findById(id);
//        article.setTitle(title);
//        article.setUpdated(LocalDateTime.now());
//        articleDao.update(article);
//        return article.toString();
//    }
//
//    @RequestMapping("delete/{id}")
//    @ResponseBody
//    public String deleteArticle(@PathVariable Long id) {
//        Article article = articleDao.findById(id);
//        articleDao.delete(article);
//        return "deleted article " + id;
//    }
}
