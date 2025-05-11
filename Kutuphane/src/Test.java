import java.util.Scanner;

public class Test extends Kitaplar {

    static Kitaplar kitaplar = new Kitaplar();//composion yaptım.Kitaplar objesini bu classa eklemiş oldum.
    static Scanner scanner = new Scanner(System.in);

    public static void islemlerigoster(){

        System.out.println("\t0-İşlemleri Görüntüle");
        System.out.println("\t1-Kitapları Görüntüle");
        System.out.println("\t2-Kitap Ekle");
        System.out.println("\t3-Kitap Ara");
        System.out.println("\t4-Kitap Ödünç Verme");
        System.out.println("\t5-Kitap Geri Alma");
        System.out.println("\t6-Gecikme Ücreti Hesaplama")  ;
        System.out.println("\t7-Kapat");
    }

    public static void  kitaplarigoruntule(){
        kitaplar.tumkitaplari_bastir();
    }
    public static void kitapekle(){

        System.out.println("Eklemek istediğiniz kitabın ismini giriniz: ");

        scanner.nextLine(); // Girdi tamponunu temizler

        String kitapisim = scanner.nextLine();

        kitaplar.kitapekle(kitapisim);

    }

    public static void kitapara(){

        System.out.println("Aradığınız kitap: ");

        scanner.nextLine(); // Girdi tamponunu temizler

        String isim = scanner.nextLine();

        kitaplar.kitaparama(isim);

    }
    public static void kitapoduncver(){

        System.out.println("Ödunç verilecek kitap: ");

        scanner.nextLine(); // Girdi tamponunu temizler

        String kitapismi = scanner.nextLine();

        kitaplar.kitapoduncver(kitapismi);

    }
    public static void kitapgerial(){

        System.out.println("Geri alınacak kitap: ");

        scanner.nextLine(); // Girdi tamponunu temizler

        String isim = scanner.nextLine();

        kitaplar.kitapgerial(isim);


    }
    public static void gecikmeucretihesapla(){

        System.out.println("Hesaplanacak gün sayısı: ");

        scanner.nextLine(); // Girdi tamponunu temizler

        int gun = scanner.nextInt();

        kitaplar.gecikmeucretihesapla(gun);


    }



    public static void main (String[] args) {

        int islem;
        System.out.println("\t Kütüphane Yönetim Sistemine Hoşgeldiniz...");

        do {

            islemlerigoster();

            System.out.println("Bir işlem seçiniz:");

            islem = scanner.nextInt();

            switch (islem) {

                case 0:
                    islemlerigoster();
                    break;
                case 1:
                    kitaplarigoruntule();
                    break;
                case 2:
                    kitapekle();
                    break;
                case 3:
                    kitapara();
                    break;
                case 4:
                    kitapoduncver();
                    break;

                case 5:
                    kitapgerial();
                    break;

                case 6:
                    gecikmeucretihesapla();
                    break;

                case 7:
                    System.out.println("Programlamadan çıkılıyor...");
                    break;
                default:
                    System.out.println("Birşeyler ter gitti lütfen doğru işlemi yaptığınızdan emin olunuz...");


            }
            if (islem != 7) {
                System.out.println("Devam için bir tuşa basınız...");
                scanner.nextLine();  // Bu satır, scanner'in doğru çalışmasını sağlamak için eklenmiştir
                scanner.nextLine();  // Kullanıcının bir tuşa basmasını bekler
            }
        } while (islem != 7);

    }

}





