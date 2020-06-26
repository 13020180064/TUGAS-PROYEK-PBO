import java.util.Scanner;
class perhitungan_gaji_karyawan
{
    public static void main(String[]rn)
    {
       
        String nama,barang;
        int gajipokok = 0;
        int totalgaji = 0;
        int tunjangan_istri_dan_anak = 0;
        int pajak = 0;
        Scanner sc = new Scanner (System.in);
       
        System.out.print("\tProgram Perhitungan Gaji Kariawan");
        System.out.print("\n====================================================");
        System.out.print("\nMasukan Nama        : ");        nama = sc.nextLine();
        System.out.print("\nMasukan NIK         : ");
        int NIK = sc.nextInt();
        System.out.println("1. golongan 1A");
        System.out.println("2. golongan 1B");
        System.out.println("3. golongan 2A");
        System.out.println("4. golongan 2B");
        System.out.println("5. golongan 3A");
        System.out.println("6. golongan 3B");
        System.out.print("");
        System.out.print("Masukan pilihan golongan : ");
        int pilih = sc.nextInt();
        if (pilih==1)
        {
            gajipokok=1000000;
            tunjangan_istri_dan_anak=100000;
        }
        else if (pilih==2)
        {
            gajipokok=1500000;
            tunjangan_istri_dan_anak=200000;
        }
        else if (pilih==3)
        {
            gajipokok=2000000;
            tunjangan_istri_dan_anak=300000;
        }
        else if (pilih==4)
        {
            gajipokok=2500000;
            tunjangan_istri_dan_anak=400000;
        }
        else if (pilih==5)
        {
            gajipokok=3000000;
            tunjangan_istri_dan_anak=500000;
        }
        else if (pilih==6)
        {
            gajipokok=3500000;
            tunjangan_istri_dan_anak=600000;
        }
            pajak=((5/2)*(gajipokok+tunjangan_istri_dan_anak))/100;
            totalgaji=((gajipokok+tunjangan_istri_dan_anak)-pajak);
    System.out.print("====================================================");
    System.out.println("\nNama Karyawan            = " + nama);
    System.out.println("NIK Karyawan             = " + NIK);
    System.out.println("Gaji Pokok               = " + gajipokok);
    System.out.println("Tunjangan Istri dan Anak = " + tunjangan_istri_dan_anak);
    System.out.println("Pajak                    = " + pajak);
    System.out.println("Total Gaji yang Diterima = " +totalgaji);
    System.out.print("====================================================");
    }
}