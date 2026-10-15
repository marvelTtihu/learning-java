package Loop;

public class DeretFibonacci {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;

        while (i <= 100){
            System.out.println(i);
            int next = i + j;
            i = j;
            j = next;   
        }
    }
    
}