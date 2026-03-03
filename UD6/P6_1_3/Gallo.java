package P6_1_3;

public class Gallo extends Pajaro{
    @Override
    public String cantar() {
        return super.cantar().replace("Pajaro","Gallo") + " " + "quiquiriqui";
    }
}
