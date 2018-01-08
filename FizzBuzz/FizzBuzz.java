public class FizzBuzz {
    public String fizzBuzz(Integer number) {
        // fizzbuzz logic here
        if(number % 3 == 0){
            String fizz= "fizz";
            return fizz;
        }
        else if(number % 5 == 0){
            String buzz= "buzz";
            return buzz;
        }
        else if(number % 5 == 0 && number % 3 == 0){
            String fizzbuzz= "fizz buzz";
            return fizzbuzz;
        }
        else{
            String numbers = number.toString();
            return numbers;
        }
    }
}