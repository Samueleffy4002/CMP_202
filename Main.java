//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CMP202 cmp202 = new CMP202();
        cmp202.printUserDetails();


        Person person = new Person();
        person.setName("David Smith");

        Person student = new Person("Bingham",
                "Samuel",
                "123456",
                "BHU/22/04/05/0099");

        Person staff = new Person("Bingham",
                "Boss Barka",
                "123456",
                "666999");

        Physics velocity = new Physics();
        System.out.println(velocity.calculateVelocity(140, 4));
        Physics velocity1 = new Physics();
        System.out.println(velocity1.calculateVelocity(4.00F, 6.00F, 8));
    }
}