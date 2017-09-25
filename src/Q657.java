/**
 * Created by Misky on 9/24/2017.
 * Judge Route Circle
 * https://leetcode.com/problems/judge-route-circle/description/
 */
public class Q657 {
    public boolean judgeCircle(String moves){
        int x = 0, y = 0;
        char[] array = moves.toCharArray();
        for (int i=0;i<array.length;i++){
            switch(array[i]){
                case 'R':x++;
                    break;
                case 'L':x--;
                    break;
                case 'U':y++;
                    break;
                case 'D':y--;
                    break;
            }

        }
        return (x==0 && y==0);
    }

    public void entry(){
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }
}
