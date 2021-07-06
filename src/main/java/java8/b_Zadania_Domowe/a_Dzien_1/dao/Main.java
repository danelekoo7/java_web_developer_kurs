package java8.b_Zadania_Domowe.a_Dzien_1.dao;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // create group
        GroupDao groupDao = new GroupDao();
        Group g = new Group("sample name");
        //save group to database
        groupDao.save(g);

        //get all groups
        List<Model> groups = groupDao.loadAll();
        for (Model model : groups) {
            Group group = (Group) model;
            System.out.println(group.getName());
        }


        //update group
        g.setName("other name");
        groupDao.save(g);

        for (Model model : groups) {
            Group group = (Group) model;
            System.out.println(group.getName());
        }

        //remove group
        Group firstElement = (Group) groupDao.loadById(1);
        if (firstElement != null) {
            groupDao.delete(firstElement);
        }

//		test for exercise


        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exercise = new Exercise("homework", "easy");

        //save exercise to database

        exerciseDao.save(exercise);

        //get all exercises
        List<Model> exercises = exerciseDao.loadAll();
        for (Model model : exercises) {
            Exercise e = (Exercise) model;
            System.out.println(e.getTitle());
            System.out.println(e.getDescription());
        }


        //update exercise
        exercise.setTitle("exam");
        exercise.setDescription("hard");

        exerciseDao.save(exercise);

        for (Model model : exercises) {
            Exercise e = (Exercise) model;
            System.out.println(e.getTitle());
            System.out.println(e.getDescription());
        }

        //remove group
        Exercise ex = (Exercise) exerciseDao.loadById(1);

        if (firstElement != null) {
            exerciseDao.delete(firstElement);
        }
    }
}
