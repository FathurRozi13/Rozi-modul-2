import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int ulang;
        do {            
            System.out.print("Masukan jumlah data : ");
            int jmlh_data = inputUser.nextInt();
            anak obj = new anak(jmlh_data);
            obj.InputData();
            obj.tampilkanData();
            System.out.println("Input lagi?");
            System.out.println("1.Ya 2.Tidak");
            ulang = inputUser.nextInt();
        } while (ulang == 1);
    }   
}
