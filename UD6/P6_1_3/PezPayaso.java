package P6_1_3;

public class PezPayaso extends Pez{
    @Override
    public String cantar(){
        return super.cantar().replace("Pez","PezPayaso") + " " + "chorprecha";
    }
}
