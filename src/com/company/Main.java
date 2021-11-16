package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kumanda programına hoşgeldiniz");
        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler...\n"
                + "1. Kanallar Göster\n"
                + "2. Kanal Ekle\n"
                + "3. Kanal Sil\n"
                + "4. Kanal Sayısı Öğren\n"
                + "Çıkış için q'ya basın";

        Kumanda kumanda = new Kumanda();

        while (true){
            System.out.println(islemler + "\n");
            System.out.println("İşlemi giriniz");
            String islem = scanner.nextLine();

           if(islem.equals("q")){
               System.out.println("Programdan çıkılıyor");
               break;
           }
           else if (islem.equals("1")){
               kanallariGoster(kumanda);
           }
           else if (islem.equals("2")){
               System.out.println("Eklenecek Kanal: ");
               String kanalİsmi = scanner.nextLine();
               kumanda.kanalEkle(kanalİsmi);
           }
           else if (islem.equals("3")){
               System.out.println("Silinecek Kanal");
               String kanalİsmi = scanner.nextLine();
               kumanda.kanalSil(kanalİsmi);
           }
           else if (islem.equals("4")){
               System.out.println("Kanal sayısı: " +kumanda.kanalSayisi());
           }
           else
               System.out.println("Geçersiz işlem");




        }

    }

    public static void kanallariGoster(Kumanda kumanda){

        if(kumanda.kanalSayisi() == 0 ){
            System.out.println("Şu an da hiçbir kanal bulunmuyor");
        }
        else{

            for(String kanal : kumanda){
                System.out.println("Kanal : " + kanal);

            }
        }
    }
}
