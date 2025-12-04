public class U4_E3 {
    public static void main(String[] args) {
        mostrarSuma();
    }

static void mostrarSuma(){
    int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
    int suma = 0;
    for (int i = 0; i < array.length; i++){
        suma += array[i];
    }
    System.out.println(suma);
}


}
