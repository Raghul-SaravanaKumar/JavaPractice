class Main {
    public static void main(String[] args) {
        int n = 145;
        int digit  = 0;
        int original = n;
        int sum = 0;
        
        while(n>0){
            digit = n%10;
           int fact = 1;
            
            for(int i = 1; i<= digit;i++){
                fact = fact * i;
            }
            sum = fact + sum;
            n = n/10;
        }
        if ( sum == original){
            System.out.println(" true");
        } 
    }
}
