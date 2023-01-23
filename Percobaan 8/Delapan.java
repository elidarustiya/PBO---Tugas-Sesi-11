/**
 * Tugas Sesi 11_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

import java.io.*;
public class Delapan {
    public void methodA(){
 System.out.println("Method A");
 }
 public void methodB() throws IOException
 {
 System.out.println(20/0);
 System.out.println("Method B");
 }
}
10
class Utama
{
 public static void main(String[] args) throws IOException
 {
 Test3 c=new Test3();
 c.methodA();
 c.methodB();
 }
}
