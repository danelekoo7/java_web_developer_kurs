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
import pl.coderslab.validation.DraftValidationGroup;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("draft")
public class DraftController {

//    private final ArticleDao articleDao;
//    private final AuthorDao authorDao;
//    private final CategoryDao categoryDao;
//
//    public DraftController(ArticleDao articleDao, AuthorDao authorDao, CategoryDao categoryDao) {
//        this.articleDao = articleDao;
//        this.authorDao = authorDao;
//        this.categoryDao = categoryDao;
//    }


    private final AuthorRepository authorRepository;
    private final CategoryRepository categoryRepository;
    private final ArticleRepository articleRepository;

    public DraftController(AuthorRepository authorRepository, CategoryRepository categoryRepository, ArticleRepository articleRepository) {
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
        this.articleRepository = articleRepository;
    }


    @GetMapping("/show")
    public String findAll() {
        return "draft/show";
    }


    @GetMapping("/add")
    public String addDraft(Model model) {
        model.addAttribute("draft", new Article());
        return "draft/add";
    }


    @PostMapping("/add")
    public String saveDraft(@ModelAttribute("draft") @Validated({DraftValidationGroup.class}) Article draft, BindingResult result) {
        if (result.hasErrors()) {
            return "draft/add";
        }
        draft.setDraft(true);
        articleRepository.save(draft);
//        articleDao.saveArticle(draft);
        return "redirect:/draft/show";
    }


    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) throws Exception {
        Optional<Article> byId = articleRepository.findById(id);
        Article article = byId.orElseThrow(Exception::new);


        model.addAttribute("draft", article);
//        model.addAttribute("draft", articleDao.findById(id));
        return "draft/edit";
    }

    @PostMapping(value = "/edit/{id}")
    public String update(@ModelAttribute("draft") @Validated({DraftValidationGroup.class}) Article draft, BindingResult result, @PathVariable Long id) throws Exception {
        if (result.hasErrors()) {
            return "draft/edit";
        }

        Optional<Article> byId = articleRepository.findById(id);
        Article draftInDB = byId.orElseThrow(Exception::new);

//        Article draftInDB = articleDao.findById(id);
        draftInDB.setDraft(draft.isDraft());
        draftInDB.setAuthor(draft.getAuthor());
        draftInDB.setCategories(draft.getCategories());
        draftInDB.setContent(draft.getContent());
        draftInDB.setTitle(draft.getTitle());
        draftInDB.setCreated(draft.getCreated());

        articleRepository.save(draftInDB);
//        articleDao.update(draftInDB);
        return "redirect:/draft/show";
    }


    @GetMapping("/delete/{id}")
    public String question(@PathVariable Long id) {
        articleRepository.deleteById(id);
//        articleDao.delete(articleDao.findById(id));
        return "redirect:/draft/show";
    }

    @ModelAttribute("articles")
    public List<Article> findAllArticles() {

        return articleRepository.findAll();
//        return articleDao.findAll();
    }

    @ModelAttribute("drafts")
    public List<Article> findAllDrafts() {
        return articleRepository.findAllByDraftIsTrue();
//        return articleDao.findAllDraft();
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
}
