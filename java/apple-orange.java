// author: Tarun Reddy Kalluri
// Solution in Java 15 version    Happy Coding

public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
            
        int countApple = 0, countOrange = 0;

        for (int i : apples)
            
            if ((a + i) >= s && (a + i) <= t)
                countApple++;

        for (int j : oranges)
            if ((b + j) <= t && (b + j) >= s)
                countOrange++;
            
        System.out.println(countApple);
        System.out.println(countOrange);
}
