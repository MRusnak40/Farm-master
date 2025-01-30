import java.util.ArrayList;
import java.util.Random;

public class Farm {

    private int sizeOfFarm;
    private ArrayList<Animal> seznamDobytku;
    private ArrayList<Flower> seznamRostlin;
Random rd =new Random();
    public Farm() {
        this.sizeOfFarm = 100;
        seznamDobytku = new ArrayList<>();
        seznamRostlin = new ArrayList<>();
    }

    public void addAnimal(int choose) {

        if (choose==1){

            seznamDobytku.add(new Guinipig("Guinipig","Pegas",Size.SMALL,"Dont trust him"));
        }

    }


    public int getSizeOfFarm() {
        return sizeOfFarm;
    }

    public void setSizeOfFarm(int sizeOfFarm) {
        this.sizeOfFarm = sizeOfFarm;
    }
}
