package rikkei.academy.model;

public class Form {
    private String name;
    private int birth;
    private String gender;
    private String national;
    private String CMND;
    private String vehicle;

    public Form() {
    }

    public Form(String name, int birth, String gender, String national, String CMND, String vehicle) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.national = national;
        this.CMND = CMND;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}