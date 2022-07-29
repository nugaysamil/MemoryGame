public class Main {
    private static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args) {



        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');

        oyunTahtasi();

    }
    public static void oyunTahtasi() {

        for(int i = 0; i<4; i++) {
            for(int j = 0; j<4; i++) {

                if(kartlar[i] [j].isTahmin()){
                    System.out.print(" i " + kartlar[i][j].getDeger()+ " ");

                }
                else {

                    System.out.print("  ");


                }
            }
            System.out.println("");
        }



    }
}
