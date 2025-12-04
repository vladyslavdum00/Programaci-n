public class Domino {
    public static void main(String[] args) {
        System.out.println(validarDomino("25-51-10"));
        contarCaracteres("banana", "b");
    }

    static boolean validarDomino(String fichas){



            int guion = 0;
            for (int i = 0; i < fichas.length(); i++){
                if (fichas.charAt(i) == '-'){
                    guion++;

                    if (guion < 1){
                        return true;
                    }


                    if (fichas.charAt(i - 1) != fichas.charAt(i + 1)){
                        return false;
                    }



                }
            }
        return true;
        }


        static void contarCaracteres(String a, String b){

            for (int i = 0; i < b.length(); i++){
                int contador = 0;
                for (int j = 0; j < a.length(); j++){
                    if (b.charAt(i) == a.charAt(j)){
                        contador++;
                    }
                }
            System.out.println(contador);
            }

        }


    }




