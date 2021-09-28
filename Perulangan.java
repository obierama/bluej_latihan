

public class Perulangan {
    public static void main(String[] args) {
        
        //segitiga kiri
        int a,b,c;
        for (a = 0; a <=7; a++) {
            for ( b = 7; b >= a; b--) {
                //System.out.print(" ");
            }
                for (c = 0; c < a; c++){
                    System.out.print("*"); //(c) untuk angka
                }
                System.out.println();
            } 
            
            

        int d,e,f;
        for (d = 0; d <=7; d++) {
            for ( e = 7; e >= d; e--) {
                System.out.print(" ");
            }
                for (f = 0; f < d; f++){
                    System.out.print("*"); //(c) untuk angka
                }
                System.out.println();
                
            }
            int g,h,i,j;
        for (g = 1; g <=9; g++) {
            for ( h = 9; h >= g; h--) {
                System.out.print(" ");
            }
                for (i = 1; i <= g; i++){
                    System.out.print(i+""); //("*") untuk bintang                
                }
                for (j = 1; j < g-1; j++){
                    System.out.print(j+""); //("*") untuk bintang
                }
                
                System.out.println();
            
        }
        
        //penjumlahan
        double panjang = 25;
              double lebar = 10;
              double jumlah;
              
              jumlah = panjang * lebar;
              
              System.out.println("Hasil Penjumlahan    : " + jumlah);

    }  
}


    

    
