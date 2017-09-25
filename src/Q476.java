/**
 * Created by Misky on 9/25/2017.
 * https://leetcode.com/problems/number-complement/description/
 */
public class Q476 {
    public int findComplement(int num) {
        String bnum = Integer.toBinaryString(num);
        char[] numL = bnum.toCharArray();
        for (int i=0;i<numL.length;i++){
            numL[i] = numL[i]=='0' ? '1' : '0';
        }
        String revert = String.valueOf(numL);
        return Integer.parseInt(revert,2);
    }

    public void entry(){
        System.out.println(findComplement(5));
    }
}
