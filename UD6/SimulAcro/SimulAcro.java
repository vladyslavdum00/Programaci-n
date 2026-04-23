package SimulAcro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimulAcro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            return;
        }
        sc.nextLine();
        ArrayList<String> ninots = new ArrayList<String>();
        ArrayList<String> adultos = new ArrayList<String>();
        ArrayList<String> infantiles = new ArrayList<String>();
        ArrayList<Integer> countA = new ArrayList<Integer>();
        ArrayList<Integer> countI = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
           ninots.add(sc.next());
        }
        for (int i = 0; i < ninots.size(); i++) {
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < ninots.get(i).length(); j++) {
                if (Character.isUpperCase(ninots.get(i).charAt(j))) {
                    count1++;
                }
                if(Character.isLowerCase(ninots.get(i).charAt(j))){
                    count2++;
                }
            }
            if (count1 == ninots.get(i).length()) {
                adultos.add(ninots.get(i));
            }
            if (count2 == ninots.get(i).length()) {
                infantiles.add(ninots.get(i));
            }
        }

        String resA = " ";
        String resI = " ";
        if (adultos.size() == 1 && infantiles.size() == 1) {
            resA = adultos.get(0);
            resI = infantiles.get(0);
            System.out.println(resI + " " + resA);
            return;
        }
        for (int i = 0; i < adultos.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < adultos.size(); j++) {
                if (adultos.get(i).equals(adultos.get(j))) {
                    count++;
                    countA.add(count);
                }
            }
        }

        for (int i = 0; i < infantiles.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < infantiles.size(); j++) {
                if (infantiles.get(i).equals(infantiles.get(j))) {
                    count++;
                    countI.add(count);
                }
            }
        }



        int MaxA = -1;
        int posA = -1;
        int cA = 0;

        if (!countA.isEmpty()) {
            for (int i = 0; i < countA.size(); i++) {
                if (countA.get(i) > MaxA) {
                    MaxA = countA.get(i);
                    posA = i;
                }
            }
            for (int i = 0; i < countA.size(); i++) {
                if (countA.get(i) == MaxA) {
                    cA++;
                }
            }
            if (cA == countA.size()) {
                resA = "EMPATE";
            }else resA = adultos.get(posA);


        }else resA = "EMPATE";





        int MaxI = -1;
        int posI = -1;
        int cI = 0;

        if (!countI.isEmpty()) {
            for (int i = 0; i < countI.size(); i++) {
                if (countI.get(i) > MaxI) {
                    MaxI = countI.get(i);
                    posI = i;
                }
            }
            for (int i = 0; i < countI.size(); i++) {
                if (countI.get(i) == MaxI) {
                    cI++;
                }
            }
            if (cI == countI.size()) {
                resA = "empate";
            }else resI = infantiles.get(posI);

        }else resI = "empate";





        System.out.println(resI + " " + resA);


    }
}
