package java8.b_Zadania_Domowe.a_Dzien_1.dao;

public class Exercise implements Model {

    private Long id;
    private String title;
    private String description;

    public Exercise(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Exercise(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
