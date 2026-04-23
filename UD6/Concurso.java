import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int count = 0;

        int n = sc.nextInt();
            if (n == 0) break;
            ArrayList<Integer> destrozos = new ArrayList<Integer>();
            ArrayList<String> preferencias = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            destrozos.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            preferencias.add(sc.next());
        }
        int j1 = -1;
        int j2 = -1;
        int pref = -1;
        String pString = "";
        for(int i = 0; i < destrozos.size(); i++){
            if (preferencias.get(i).equals("oo")) continue;
            for(int j = i + 1; j < preferencias.size(); j++) {
                if (preferencias.get(j).equals("oo")) continue;
                if (preferencias.get(i).charAt(0) == '=') {

                    String p = preferencias.get(i);
                    pString = p.substring(1);
                    pref = Integer.parseInt(pString);
                    if (destrozos.get(j) == pref) {
                        String pString2 = "";
                        int pref2 = -1;
                        String p2 = "";
                        switch (preferencias.get(j).charAt(0)) {

                            case '=':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (pref2 == destrozos.get(i)) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");
                                }
                                break;
                            case '<':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (destrozos.get(i) < pref2) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");
                                }
                                break;
                            case '>':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (destrozos.get(i) > pref2) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");

                                }
                                break;
                        }
                    }

                } else if (preferencias.get(i).charAt(0) == '<') {
                    String p = preferencias.get(i);
                    pString = p.substring(1);
                    pref = Integer.parseInt(pString);
                    if (destrozos.get(j) < pref) {
                        String pString2 = "";
                        int pref2 = -1;
                        String p2 = "";
                        switch (preferencias.get(j).charAt(0)) {

                            case '=':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (pref2 == destrozos.get(i)) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");
                                }
                                break;
                            case '<':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (destrozos.get(i) < pref2) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");
                                }
                                break;
                            case '>':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (destrozos.get(i) > pref2) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");
                                }
                                break;
                        }
                    }
                } else if (preferencias.get(i).charAt(0) == '>') {
                    String p = preferencias.get(i);
                    pString = p.substring(1);
                    pref = Integer.parseInt(pString);
                    if (destrozos.get(j) > pref) {
                        String pString2 = "";
                        int pref2 = -1;
                        String p2 = "";
                        switch (preferencias.get(j).charAt(0)) {

                            case '=':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (pref2 == destrozos.get(i)) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");
                                }
                                break;
                            case '<':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (destrozos.get(i) < pref2) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");
                                }
                                break;
                            case '>':
                                p2 = preferencias.get(j);
                                pString2 = p2.substring(1);
                                pref2 = Integer.parseInt(pString2);
                                if (destrozos.get(i) > pref2) {
                                    System.out.println((i + 1) + " " + (j + 1));
                                    count++;
                                    preferencias.set(j, "oo");
                                    destrozos.set(j, -1);
                                    destrozos.set(i, -1);
                                    preferencias.set(i, "oo");

                                }
                                break;
                        }
                    }
                }
                if (preferencias.get(i).equals("oo")) break;
            }
            }
            if(count == 0){
                System.out.println("NO HAY");
            }
            System.out.println("---");
        }

    }
}
