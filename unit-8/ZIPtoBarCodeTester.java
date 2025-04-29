/**
   A test for the ZIPtoBarCode class.
*/
public class ZIPtoBarCodeTester
{
   public static void main(String[] args)
   {
      System.out.println("ZIP code: 95014");
      int[] inputCode = new int[] { 9, 5, 0, 1, 4 };
      System.out.println("Barcode : " + ZIPtoBarCode.convertZIP(inputCode));
      System.out.println("Expected: ||:|:::|:|:||::::::||:|::|:::|||");

      System.out.println("");

      /*System.out.println("Barcode : ||:|:::|:|:||::::::||:|::|:::|||");
      int[] outputCode = ZIPtoBarCode
            .convertBarcode("||:|:::|:|:||::::::||:|::|:::|||");
      System.out.println("ZIP code: " + outputCode[0] + outputCode[1]
            + outputCode[2] + outputCode[3] + outputCode[4]);
      System.out.println("Expected: 95014");
      */
   }
}