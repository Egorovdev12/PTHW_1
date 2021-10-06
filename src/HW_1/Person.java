package HW_1;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected OptionalInt age;
    protected String currentCity;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
    }

    public Person(String name, String surname, int age, String currentCity) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
        this.currentCity = currentCity;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder temp = new PersonBuilder();
        temp.setSurname(this.surname)
                .setAge(0)
                .setAddress(this.currentCity);
        return temp;
    }

    public boolean hasAge() {
        return this.age.isPresent();
    }

    public boolean hasAddress() {
        return this.currentCity.equals(null);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (this.name.isEmpty())
            sb.append("NAME: NODATA, ");
        else
            sb.append("NAME: " + this.name + ", ");

        if (this.surname == null)
            sb.append("SURNAME: NODATA, ");
        else
            sb.append("SURNAME: " + this.surname + ", ");

        if (this.age.isPresent())
            sb.append("AGE: " + age.getAsInt() + ", ");
        else
            sb.append("AGE: NODATA, ");

        if (this.currentCity == null)
            sb.append("CITY: NODATA");
        else
            sb.append("CITY: " + this.currentCity);

        return sb.toString();
    }

    public void setCurrentCity(String city){
        this.currentCity = city;
    }

    public void happyBirthday() {
       int temp = this.age.getAsInt();
       temp++;
       this.age = OptionalInt.of(temp);
    }
}