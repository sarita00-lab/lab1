import java.util.Arrays;

public class ArrayManipulation {
    
    public static void main(String[] args) {
        int [] numbers = {5,8,3,2,7};

        String [] names =  {"Alice","Bob","Charlie","David"};
        String [] reversedNames = {"David","Charlie","Bob","Alice"};

        Double [] values = new Double[4];

        values[0]= 1.1;
        values[1]= 2.2;
        values[2]= 3.3;
        values[3]= 4.4;
    

        for (int i =0;i<numbers.length;i++){
             System.out.print(numbers[i] + " ");
        }
        

        for(int i=0;i<names.length;i++){
             System.out.print(names[i] + " ");
        }
        
            
        for(int i =0;i< values.length;i++){
              System.out.println(values[i]);
        }
    
    
        int total = 0;
        for(int i=0;i<numbers.length;i++){
             total +=  numbers[i];
        }
        System.out.println("\nSum = "+total);

        double max = values[0];
        for(int i=1;i<values.length;i++){
            if (values[i]>max){
                max = values[i];
            }
        }
        System.out.println("Max = "+ max);

        System.out.print("elements of the array in reverse order = ");
        for(String name : reversedNames ){
            System.out.println(name);
        }
        
        Arrays.sort(numbers);
        System.out.println("จากน้อยไปมาก: " + Arrays.toString(numbers));


    }


}



        
    