/**
 * Tugas Sesi 11_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

public class Exception2 {
    public static void main(String[] args) {
 int i=0;
 String greetings[]={
 "Hello World!",
 "No,I mean it!",
 "HELLO WORLD!"
 };
 while(i<3)
 {
 try
 {
 System.out.println(greetings[i]);
 i++;
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 System.out.println("Resetting index value");
 i=0;
 }
 }
 }
}
