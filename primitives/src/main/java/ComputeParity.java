public class ComputeParity {

    /*
    5.1
    */

  public static short parity(long n) {

    short count = 0;
    while (n != 0) {
      count ^= 1;
      n &= (n - 1);
    }

    return count;
  }
}
