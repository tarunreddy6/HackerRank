// Happy Coding :)

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here.
        Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
      
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = s.nextInt();
        for(int i=0;i<n;i++)
            list.add(s.nextInt());
        int q = s.nextInt();
        for(int j=0;j<q;j++)
        {
            String op = s.next();
            if(op.compareTo("Insert")==0)
            {
                int pos = s.nextInt();
                int val = s.nextInt();
                list.add(pos,val);
            }
            else
            {
                int pos = s.nextInt();
                list.remove(pos);
            }
        }
        for(int k=0;k<list.size();k++)
            System.out.print(list.get(k)+" ");
        s.close();
    }
}
