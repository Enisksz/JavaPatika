package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int mat,fizik,kimya,turkce,tarih,muzik;
        double ort=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();

        ort = (mat+kimya+fizik+tarih+turkce+muzik)/6;
        System.out.println(ort);

        String gecti = "gecti";
        String kaldi = "kaldi";

        String sonuc;
        
        sonuc = !(ort<60)? gecti:kaldi;

        System.out.println(sonuc);

    }
}
