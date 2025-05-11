import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kitaplar {


    public ArrayList<String> kitaplar = new ArrayList<String>();



    public void tumkitaplari_bastir(){

        System.out.println("Kitap listesinde "+ kitaplar.size()+" tane kitap var.");



        for(int i =0; i< kitaplar.size(); i++ ){

        System.out.println((i+1) + ".Kitap: "+kitaplar.get(i));
    }
    }
    public void kitapekle(String kitapisim){

        kitaplar.add(kitapisim);

        System.out.println("Kitap eklendi...");

    }

    //public void kitap guncelle

    public void kitaparama(String kitapismi){

        int id = kitaplar.indexOf(kitapismi);

        if(id>= 0){

            System.out.println("Kitap bulundu...");

            System.out.println(kitapismi+" isimli kitap "+(id+1)+" sırasındadır.");
        }
        else{
            System.out.println("Kitap bulunamadı...");
            System.out.println("Lütfen girdiğiniz kitap isminin doğru olduğundan emin olunuz...");
        }

    }

    public void kitapoduncver(String kitapismi){

        if(kitaplar.contains(kitapismi)){
            System.out.println(kitapismi+" ismindeki kitap ödünç verildi.");
            kitaplar.remove(kitapismi);
        }
        else {

            System.out.println("İşleminiz başarısız...Lütfen girdiğiniz kitap ismini tekrar kontrol ediniz.");

        }
    }

    public void kitapgerial(String kitapismi){


        kitaplar.add(kitapismi);

        System.out.println("Kitap geri alındı...");

    }

    public void gecikmeucretihesapla(int gun){

        double gunlukgecikmeucret = 3.5;

        double toplamucret = gunlukgecikmeucret*gun;

        System.out.println("Hesaplanan gecikme ücreti: "+toplamucret);

    }


}
