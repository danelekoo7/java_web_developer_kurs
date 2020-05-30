package pl.coderslab.converter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.entity.Author;
import pl.coderslab.repository.AuthorRepository;

import java.util.Optional;

public class AuthorConverter implements Converter<String, Author> {

//    @Autowired
//    private AuthorDao authorDao;

    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public Author convert(String s) {

        Optional<Author> byId = authorRepository.findById(Long.parseLong(s));
        Author author = null;
        try {
            author = byId.orElseThrow(Exception::new);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return author;
//        return authorDao.findById(Long.parseLong(s));
    }
}
