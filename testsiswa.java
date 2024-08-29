// Driver class

import java.util.Scanner;

public class testsiswa {
       
        public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("NAMA : ");
       String nama = in.nextLine();
        System.out.println("ID : ");
       int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
        //membuat obyek
        siswa risky = new siswa();
        siswa iqbal = new siswa();
        siswa nabil = new siswa(
        );
        siswa cahya = new siswa(id,nama,ipk);
        risky.setId(100); 
        risky.setNama(risky);
        risky.setIpk(24);
        System.out.println("Ini Data Adi");
        System.out.println(risky.getId());
        System.out.println(risky.getNama());
        System.out.println(risky.getIpk());
        siswa dion = new siswa(id,nama,ipk);
         nabil.setId(10);
         nabil.setNama(nabil);
        dion.ipk=0;
        System.out.println("Ini Data Dion");
        System.out.println(dion.getId());
        System.out.println(dion.getNama());
        System.out.println(dion.getIpk());  

        

        

    }
}
