// Happy Coding:)
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        String tokens = " !,?._@'";
        ArrayList<String> list=new ArrayList<String>();
        int tokenindex = 0;
        
        for(int i =0; i<s.length(); i++)
        {
            for(int j = 0; j< tokens.length(); j++)
            {
                if(s.charAt(i) == tokens.charAt(j))
                {
                    list.add(s.substring(tokenindex,i));
                    tokenindex = i+1;
                }
            }
        }
                
        list.add(s.substring(tokenindex));
        for( Iterator<String> iterator=list.iterator();iterator.hasNext(); )
        {
            String value=iterator.next();
            if(value.isEmpty())
            {
                iterator.remove();
            }
        }
        System.out.println(list.size());
        for(String str:list)
        {
            System.out.println(str);
        }
    }
}
