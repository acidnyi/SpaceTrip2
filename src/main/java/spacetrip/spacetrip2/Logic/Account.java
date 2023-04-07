package spacetrip.spacetrip2.Logic;

import java.io.Serializable;

public class Account implements Serializable {
    private String login;
    private String password;

    private String name;
    private String surname;
    private String race;

    boolean pet;

    public Account(String name, String surname, String race, String login, String password, boolean pet) {
        this.setName(name);
        this.setSurname(surname);
        this.setRace(race);
        this.setLogin(login);
        this.setPassword(password);
        this.setPet(pet);
    }
    public Account(){

    }
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getRace() {
        return this.race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }
}