package spring.dependency.src.main.java.pl.coderslab.beans;

public class Ship {
    Captain captain;

    public Ship(Captain captain) {
        this.captain = captain;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }
}
