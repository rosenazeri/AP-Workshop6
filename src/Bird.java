public class Bird extends Animal{
    private String heightOfFly ;

    public Bird(String name, String age,String heightOfFly , String specialPoint) {
        super(name, age, specialPoint);
        this.heightOfFly = heightOfFly;
    }


    public String getHeightOfFly() {
        return heightOfFly;
    }

    public void setHeightOfFly(String heightOfFly) {
        this.heightOfFly = heightOfFly;
    }

}
