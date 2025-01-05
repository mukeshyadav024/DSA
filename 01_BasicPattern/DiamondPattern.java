public class DiamondPattern{
      public static void pattern(int n){
    
    // upper pattern code
         for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
           
             System.out.println();
         }
    
    

    // lower pattern code
         for(int i=n;i>1;i--){
            
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(i-1)*2;k++){
                System.out.print("*");
            }
           
             System.out.println();
         }

   

     }   
    


    public static void main(String[] args){
        
        pattern(10); 
        
    }
}
