import java.util.ArrayList;

public class Main {
    public static ArrayList<Animal> AnimalList = new ArrayList<>();
    public static void main(String[] arg){
         Cheetah cheetah = new Cheetah("chiti" , "12" , "4 m/s" , "fastest animal ");
         Giraffe giraffe = new Giraffe("giri" , "18" , "0.5 m/s" , "tallest animal");
         Parrot parrot = new Parrot("parri" , "5" , "16 m" , "it speaks like human");
         Eagle eagle = new Eagle("egi" , "32" , "30 m" , "eagles are always alone");
        Cheetah cheetah2 = new Cheetah("chiti2" , "16" , "7 m/s" , "fastest animal ");
        Giraffe giraffe2 = new Giraffe("giri2" , "10" , "0.9 m/s" , "tallest animal");
        Parrot parrot2 = new Parrot("parri2" , "9" , "12 m" , "it speaks like human");
        Eagle eagle2 = new Eagle("egi2" , "45" , "38 m" , "eagles are always alone");
         AnimalList.add(cheetah);
         AnimalList.add(giraffe);
         AnimalList.add(parrot);
         AnimalList.add(eagle);
        AnimalList.add(cheetah2);
        AnimalList.add(giraffe2);
        AnimalList.add(parrot2);
        AnimalList.add(eagle2);
         for (Animal animal : AnimalList){
             animal.show();
         }
         for (Animal animal : AnimalList){
            if (animal instanceof Hunter) {
                ((Hunter) animal).hunt();
            }
            if (animal instanceof Prey) {
                ((Prey) animal).runAway();
            }
        }
    }
}
