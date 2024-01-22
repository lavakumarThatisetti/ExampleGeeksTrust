package entity;

public class Person {
    private int id;
    private String personName;
    private ApartmentType apartmentType;
    private int noOfDays;
    private int costOfPerson;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public int getCostOfPerson() {
        return costOfPerson;
    }

    public void setCostOfPerson(int costOfPerson) {
        this.costOfPerson = costOfPerson;
    }
}
