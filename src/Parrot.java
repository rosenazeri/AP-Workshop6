public class Parrot extends Bird{
    public Parrot(String name, String age, String heightOfFly, String specialPoint) {
        super(name, age, heightOfFly, specialPoint);
    }

    @Override
    public void show() {
        System.out.println("Name: " +  getName() + ", Age: " + getAge() + ", Heigh Of Fly: " +  getHeightOfFly() + ", Special Point: " +  getSpecialPoint());
    }
}
