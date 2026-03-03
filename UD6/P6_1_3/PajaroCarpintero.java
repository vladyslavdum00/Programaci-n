package P6_1_3;

public class PajaroCarpintero  extends Pajaro{
    @Override
    public String cantar(){
    return super.cantar().replace("Pajaro","PajaroCarpintero") + " " +"picomadera";
    }
}
