public class BinomialCoefficient{


    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

  public static int BinoCoeff(int n,int r){
        
        int n_fact=fact(n);
        int r_fact=fact(r);
        int cmr_fact=fact(n-r);
        int res=n_fact/(r_fact*cmr_fact);
        return res;

    }
    


    public static void main(String[] args){
         
         int binCoeffRes=BinoCoeff(5,3);
        System.out.print(binCoeffRes);

    }
}
