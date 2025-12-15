public class U4P3_E1 {
    static void main(String[] args) {
        int[][] m = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
   imprimirMatriz(m);

    }


static void imprimirMatriz(int[][] m){
        for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m[i].length; j++){
            System.out.printf("%4d", m[i][j]);
        }
        System.out.println();
        }
}

}
