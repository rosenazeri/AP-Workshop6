import java.util.ArrayList;

public class Main {
    public static ArrayList<Animal> AnimalList = new ArrayList<>();
    public static void main(String[] arg){
         Cheetah cheetah = new Cheetah("chiti" , "12" , "4 m/s" , "fastest animal ");
         Giraffe giraffe = new Giraffe("giri" , "18" , "0.5 m/s" , "tallest animal");
         Parrot parrot = new Parrot("parri" , "5" , "16 m" , "it speaks like human");
         Eagle eagle = new Eagle("egi" , "32" , "30 m" , "eagles are always alone");
         AnimalList.add(cheetah);
         AnimalList.add(giraffe);
         AnimalList.add(parrot);
         AnimalList.add(eagle);
         for (Animal animal : AnimalList){
             animal.show();
         }
    }
}
