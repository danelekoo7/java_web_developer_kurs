package pl.coderslab.entity;

import org.springframework.format.annotation.DateTimeFormat;
import pl.coderslab.validation.ArticleValidationGroup;
import pl.coderslab.validation.DraftValidationGroup;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articles")

public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(groups = {DraftValidationGroup.class, ArticleValidationGroup.class})
    @Size(max = 200, groups = {DraftValidationGroup.class, ArticleValidationGroup.class})
    @Column(length = 200)
    private String title;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    @NotEmpty(groups = ArticleValidationGroup.class)
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();


    @NotBlank(groups = {DraftValidationGroup.class, ArticleValidationGroup.class})
    @Size(min = 500, groups = ArticleValidationGroup.class)
    @Column(columnDefinition = "TEXT")
    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate updated;


    private boolean draft;

    @PrePersist
    public void prePersist() {
        created = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        updated = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    @Override
    public String toString() {
        return "Article{" +
                "Id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", categories=" + categories +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
