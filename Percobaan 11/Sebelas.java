/**
 * Tugas Sesi 11_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

class RangeErrorException extends Throwable {
    public RangeErrorException(String s)
 {
 super(s);
 }
12
 
 public static void main(String[] args)
 {
 int position=1;
 try
 {
 if(position>0)
 {
 throw new RangeErrorException("Position " +position);
 }
 }
 catch(RangeErrorException e)
 {
 System.out.println("Range error: " +e.getMessage());
 }
 System.out.println("This is the last program.");
 }
}
