package Farm;

import Farm.Home.HomeAnimals;

import java.util.Arrays;

public class Farm {
    private Farmer farmer;
    private HomeAnimals[] homeAnimals = new HomeAnimals[10];

    @Override
    public String toString() {
        return "Farm{" +
                "homeAnimals=" + Arrays.toString(homeAnimals) +
                '}';
    }

    public void addAnimal(HomeAnimals homeAnimals) {
        for (int i = 0; i < this.homeAnimals.length; i++) {
            if (this.homeAnimals[i] == null) {
                this.homeAnimals[i] = homeAnimals;
                break;
            }
        }
    }
    public HomeAnimals attackTarget(){
        HomeAnimals attackTarget = homeAnimals[(int)(Math.random()*2)];
        return attackTarget;
    }
}
