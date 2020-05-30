package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Author;
import pl.coderslab.repository.AuthorRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("author")
public class AuthorController {
//    private final AuthorDao authorDao;
//
//    public AuthorController(AuthorDao authorDao) {
//        this.authorDao = authorDao;
//    }

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @GetMapping("/show")
    public String findAll() {
        return "author/show";
    }


    @GetMapping("/add")
    public String addAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "author/add";
    }


    @PostMapping("/add")
    public String saveAuthor(@Valid Author author, BindingResult result) {
        if (result.hasErrors()) {
            return "author/add";
        }

        authorRepository.save(author);
//        authorDao.saveAuthor(author);
        return "redirect:/author/show";
    }


    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) throws Exception {
        Optional<Author> byId = authorRepository.findById(id);
        Author author = byId.orElseThrow(Exception::new);

        model.addAttribute("author", author);
//        model.addAttribute("author", authorDao.findById(id));
        return "author/edit";
    }

    @PostMapping(value = "/edit/{id}")
    public String update(@Valid Author author, BindingResult result, @PathVariable Long id) throws Exception {
        if (result.hasErrors()) {
            return "author/edit";
        }

        Optional<Author> byId = authorRepository.findById(id);
        Author authorInDB = byId.orElseThrow(Exception::new);
//        Author authorInDB = authorDao.findById(id);
        authorInDB.setLastName(author.getLastName());
        authorInDB.setFirstName(author.getFirstName());

        authorRepository.save(author);
//        authorDao.update(authorInDB);
        return "redirect:/author/show";
    }


    @GetMapping("/delete/{id}")
    public String question(@PathVariable Long id) throws Exception {

        authorRepository.deleteById(id);
//        authorDao.delete(authorDao.findById(id));
        return "redirect:/author/show";
    }


    @ModelAttribute("authors")
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
//        return authorDao.findAll();
    }

}
