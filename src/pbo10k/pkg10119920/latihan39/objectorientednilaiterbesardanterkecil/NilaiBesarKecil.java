/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan39.objectorientednilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Mahasiswa{
    Scanner input = new Scanner(System.in);
    public int banyakNilai;
    public int array[];
    
    public void hitungNilai(){
    
    int min, max;
    for(int i = 0; i < banyakNilai; i++) {
        System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) +" = " );
        array[i] = input.nextInt();
        }
        max = array[0];        
        min = array[0];

    for(int i = 0; i < banyakNilai; i++) {
        if (array[i] > max){
        max = array[i];
        }
        else if(array[i] < min){
        min = array[i];  
        }  
    }
    
    System.out.println();
    System.out.println("====Hasil Nilai Mahasiswa====");

    for(int i = 0; i < banyakNilai; i++) {
        System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + array[i] );
          
        }        
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);         
    }
}

class Petugas{
    public String nama;
    
    public String namaPetugas(){
        System.out.println("\nPetugas : " + nama);
        return null;
    }
}

public class NilaiBesarKecil {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        Petugas ptg = new Petugas();
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        System.out.print("Masukkan Nama Petugas : ");
        ptg.nama = input.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        mhs.banyakNilai = input.nextInt();
        mhs.array = new int[mhs.banyakNilai];
        mhs.hitungNilai();
        
        ptg.namaPetugas();
    }
    
}
