public abstract class Animal{
       private String name ;
       private String age ;
       private String specialPoint ;

    public Animal(String name, String age, String specialPoint) {
        this.name = name;
        this.age = age;
        this.specialPoint = specialPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSpecialPoint() {
        return specialPoint;
    }

    public void setSpecialPoint(String specialPoint) {
        this.specialPoint = specialPoint;
    }
    public abstract void show() ;
}