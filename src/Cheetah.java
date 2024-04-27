public class Cheetah extends Mammel implements Hunter{

    public Cheetah(String name, String age, String speed, String specialPoint) {
        super(name, age, speed, specialPoint);
    }
    @Override
    public void show() {
        System.out.println("Name: " +getName() + ", Age: " + getAge() + ", Speed: " + getSpeed() + ", Special Point: " + getSpecialPoint());
    }
    @Override
        public void hunt() {
            System.out.println( getName() +" is hunting");
        }

}

