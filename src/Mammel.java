public class Mammel extends Animal{
    private String speed ;
    public Mammel(String name, String age, String speed) {
        super(name, age);
        this.speed = speed;
    }
    public String getSpeed() {
        return speed;
    }
    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
