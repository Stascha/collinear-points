public class CollinearPoints{

    static boolean  fun(int[] x, int[] y )
    {
        int n = x.length;
        
        for(int i = 0 ;    i < n-2;  i++)
         for(int j = i+1 ;  j < n-1;  j++)
          for(int k = j+1 ;  k < n;     k++)
          {
            if( (y[j] - y[i]) * (x[k] - x[i]) == (y[k] - y[i]) * (x[j] - x[i]) )
              return true;
          }
          
        return false;  
        
    }
    
    public static void main(String []args){
         
        int[] x = {1,2,34,4,5,7,99}; 
        int[] y = {19,2,33,4,66,79,99};
        
        boolean s = fun(x,y);
        
        if(s)
            System.out.println("There are 3 collinear points");
        else
            System.out.println("There are no 3 collinear points");
    }

}
