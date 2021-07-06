package exam.main.java.pl.coderslab.web;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {
    public static List<Smurf> getList() {
        List<Smurf> smurfs = new ArrayList<>();
        smurfs.add(new Smurf("maruda", "okulary", "marudzi"));
        smurfs.add(new Smurf("smerfetka", "blond", "ladna"));
        smurfs.add(new Smurf("silacz", "tatuaz", "silny"));
        smurfs.add(new Smurf("zgrywus", "prezent", "zartownis"));
        smurfs.add(new Smurf("papa", "czerwony", "madry"));
        return smurfs;
    }

}

