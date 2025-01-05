public class Xpattern{

     public static void pattern(int n){
    
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n*2;j++){
                
                if(j==i||j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
         }
        
    }

    public static void main(String[] args){
        
        pattern(7);

    }
        
    
}