import java.util.Scanner;

/**
 * Created by Misky on 9/24/2017.
 * Hamming Distance
 *
 */
public class Q461 {

    public int hammingDistance(int x, int y) {
        //return Integer.bitCount(x^y);
        int c = x^y;
        int count = 0;
        while (c>0){
            if ((c & 1) != 0) count++;
            c = c>>1;
        }
        return count;
    }

    public void entry(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(hammingDistance(x,y));
    }
}
