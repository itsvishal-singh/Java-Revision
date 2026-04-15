/*
Data Type 
1. Primitive 
  1.1 Integer : 
    1.1.1 byte (1 byte) -> (-2^7) to (2^7)-1 ,
    1.1.2 short (2 bytes) -> (-2^15) to (2^15)-1 , 
    1.1.3 int (4 bytes) -> (-2^31) to (2^31)-1 , 
    1.1.4 long (8 bytes) -> (-2^63) to (2^63)-1
  1.2 Float : 
    1.2.1 float (4 bytes) float num = 5.6f;
    1.2.2 double (8 bytes) double num = 5.6;
  1.3 Character : char (2 bytes) UNICODE (not ASCII), char c = 'k'; 
  1.4 Boolean : True/False (not 0/1) boolean b = true;
2. 
*/
class DataType{
  public static void main(String[] args) {
      int num = 9; 
      byte by = 127;
      short sh = 524;
      long lg = 6546l;

      float flt = 5.8f;
      double dble = 5.8;

      char c = 'k';

      boolean b = true;
      
  }
}