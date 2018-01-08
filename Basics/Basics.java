import java.util.Arrays;
public class Basics{
    public int[] printNum(int num){
        int i = 0;
        int x = num;
        int[] myArray;
        
        myArray= new int[x];    
        while(i < x){   
            myArray[i] = i + 1;
            i++;
        }
        // while(i < x){   
        //     if (i%2!=0){
        //         myArray[i] = i;
        //     }
        //     i++;
        // }
        return myArray;
    }
}