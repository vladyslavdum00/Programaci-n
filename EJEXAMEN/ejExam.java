public class ejExam {
    static void main(String[] args) {
        int max = 8;
        int[] regalos = {2, 3, 1, 2};
        int viajes = calcularViajes(max, regalos);
        System.out.println(viajes);
        //int [][] mapa = {
               // {1, 0, 2},
               // {3, 4, 1},
                //{0, 2, 5}};
        //char[] movimientos = {'D', 'S', 'S', 'D'};
        //int niños = recorridosanta(mapa, movimientos);
        //System.out.println(niños);
    }

    static int calcularViajes(int max, int[] regalos) {
        int peso = 0;
        int viajes = 0;
       for (int i = 0; i < regalos.length; i++) {
           peso += regalos[i];
           if (peso == max) {
               viajes++;
               peso = 0;
           }
            if (peso > max) {
                peso -= regalos[i];
                viajes++;
            }
       }

        if(peso < max && peso > 0){
            viajes++;
        }
        return viajes;
    }


    static int recorridosanta(int[][] mapa, char[] movimientos) {
        int fila = 0;
        int columna = 0;
        int marcador = 0;
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] == 'D') {
                columna++;
            }
            if (movimientos[i] == 'S') {
                fila++;
            }
            if (movimientos[i] == 'W') {
                fila--;
            }
            if (movimientos[i] == 'A') {
                columna--;
            }
            if (fila > mapa.length - 1 || fila < 0 || columna < 0 || columna > mapa[0].length - 1) {
                return -1;
            }
        }

        return mapa[fila][columna];
    }
}




