public abstract class Mammel extends Animal{
    private String speed ;

    public Mammel(String name, String age,String speed , String specialPoint) {
        super(name, age, specialPoint);
        this.speed = speed;
    }
    public String getSpeed() {
        return speed;
    }
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void show() {

    }
    public void hunt() {
    }
}
