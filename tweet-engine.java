import java.util.Scanner;
public class Tweet {
      public static String f;
      public static String g;
      public static String h;
      public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Please input tweet: ");
         f = sc.nextLine();
         System.out.println("Please input correlating hashtag without #: ");
         g = sc.nextLine();
         String [] arr = { f};
         String [] arr1 = { g};
         System.out.println("To search for tweets please input the correlating hashtag or enter tweet to make a new tweet: ");
         Scanner cc = new Scanner(System.in);
         System.out.println("Please input tweet: ");
         h = cc.nextLine();
         if(h.equals(g)){
            for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
            }
         }
      }

      public static String[] reverse(String[] list) {
         String [] array = new String[list.length];
         for (int i = 0, j = array.length - 1; i < list.length; i++, j--) {
            array[j] = list[i];
            System.out.print(list[i]);
         }
         return array;
      }
}
