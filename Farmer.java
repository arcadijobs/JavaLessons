package Farm;

public class Farmer {

    int res = 10;
    boolean isAliave = true;

    public void eat(){
        if (res > 0){
            System.out.println("Фермер покушал и сыт");
        } else {
            isAliave = false;
        }
        res--;
    }

    public void defend(){
        System.out.println("Фермер защищает ферму");
    }

    public void feed(){
        System.out.println("Фермер кормит животных");
    }

    public void gather() {
        System.out.println("Фермер собирает ресурсы");
    }

    public int getRes() {
        return res;
    }

    public boolean isAliave(){
        return isAliave;
    }
}
