public class Harmonic {
    /*Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

Harmonik Seri Formülü :*/

    static double Harmonic(int[] arr){

        for (int i=0; i< arr.length;i++){
            double harmon=0;
            if (arr[0]==0){return 0;}
            System.out.println("--------");
            for (int j=1; j<=arr[i];j++){
                harmon+=(1.0/j);

            }System.out.println("Harmonik Seri:\t"+harmon);
            double harmonicOrt=arr.length/harmon;
            System.out.println("Harmonik Ortalama:\t"+harmonicOrt);

        }return 1;
    }
}