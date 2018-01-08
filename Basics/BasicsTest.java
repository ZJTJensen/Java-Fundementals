import java.util.Arrays;
public class BasicsTest{
    public static void main(String[] args){
        Basics manipulator = new Basics();
        int[] str = manipulator.printNum(255);
        
        // System.out.println(Arrays.toString(str));
        int num = 0;
        // for(int i = 0; i < str.length; i++){
        //     num += (i + 1);
        //     System.out.println("Your number is:" + i +" The cureent summ is: "+ num);
        // }

        //max
        // for(int i = 0; i < str.length; i++){
        //     if(num < str[i]){
        //         num = str[i];
        //     }
        // }
        // System.out.println(num);

        //average
        // int length = 0;
        //  for(int i = 0; i < str.length; i++){`
        //     num += str[i] ;
        //     length += 1;
        // }
        // double answer = num/ length;
        // System.out.println(answer);

        //greater than y
        // int length = 0;
        //  for(int i = 0; i < str.length; i++){
        //     if(str[i]> num ){
        //         System.out.println(str[i]);
        //     }
        // }
        //remove neg
        //  for(int i = 0; i < str.length; i++){
        //     if(str[i]< 0){
        //         str[i]=0;
        //     }
        // }

        //max min avg
        //  int length = 0;
        //  int min = str[0];
        //  int max = str[0];
        //  for(int i = 0; i < str.length; i++){
        //     num += str[i];
        //     if(str[i]> max){
        //         max = str[i];
        //     }
        //     if(str[i]< min){
        //         min = str[i];
        //     }
        //     length += 1;
        // }
        // double answer = num/ length;
        // System.out.println(answer);
        // System.out.println(min);
        // System.out.println(max);

        //odds
        for (int i = 0; i< str.length; i++){
            if (str[i] % 2 != 0){
                System.out.println(str[i]);
            }
        }

        //shifting
        //  for (int i = 0; i< str.length-1; i++){
        //      str[i]=str[i+1];
        //      str[i+1] = 0;
        // }
        // System.out.println(Arrays.toString(str));
    }
}