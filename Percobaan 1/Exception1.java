/**
 * Tugas Sesi 11_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

public class Exception1 {
    public static void main(String[] args) {
 int a[]=new int[5];
 try
 {
 a[5]=100;
 }
 catch(Exception e)
 {
 System.out.println("Terjadi pelanggaran memory");
 }
 }
}
