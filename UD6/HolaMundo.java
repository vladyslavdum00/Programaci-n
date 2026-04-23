import java.util.ArrayList;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> fuerza = new ArrayList<>();
        ArrayList<String> preferencias = new ArrayList<>();

        int p1 = -1;
        int p2 = -1;

        for (int i = 0; i < n; i++) {
            fuerza.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            preferencias.add(sc.next());
        }
        int f = -1;
        for (int i = 0; i < n; i++) {
            if(fuerza.get(i) == -1){
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if(preferencias.get(j) == null){
                    continue;
                }
                if(preferencias.get(i).charAt(0) == '='){
                    String p = preferencias.get(i).trim();
                    f = Integer.parseInt(p.substring(1).trim());
                }
            }
            System.out.println(f);
        }
    }
}


