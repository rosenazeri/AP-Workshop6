public class Giraffe extends Mammel{
    public Giraffe(String name, String age, String speed, String specialPoint) {
        super(name, age, speed, specialPoint);
    }
    @Override
    public void show() {
        System.out.println("Name: " +getName() + ", Age: " + getAge() + ", Speed: " + getSpeed() + ", Special Point: " + getSpecialPoint());
    }
}
