package HW_1;

public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Olesya")
                .setSurname("Sokolova")
                .setAge(39)
                .setAddress("Saint-P")
                .build();

        System.out.println(mom);

        Person son = mom.newChildBuilder()
                .setName("Onton")
                .build();

        System.out.println(son);

//        try {
//            // Не хватает обязательных полей
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }

//        try {
//            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
    }
}
