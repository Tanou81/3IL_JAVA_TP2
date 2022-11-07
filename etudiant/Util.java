package etudiant;

public class Util {
  public static int ackermann(int m , int n ){
//𝐴(0, 𝑛) = 𝑛 + 1 pour 𝑛 > 0
    if (m ==0 ){
      return n+1; 
       //𝐴(𝑚, 0) = 𝐴(𝑚 − 1, 1) pour 𝑚 > 0
    }else if (n ==0 ){
      return ackermann(n-1, 1 );
    }else {
      return ackermann(m-1,ackermann(m,n-1) );
    }
   /* 
— 𝐴(𝑚, 𝑛) = 𝐴(𝑚 − 1, 𝐴(𝑚, 𝑛 − 1)) pour 𝑚 > 0 et 𝑛 > 0
— 𝐴(0, 𝑛) = 𝑛 + 1 pour 𝑛 > 0
— 𝐴(𝑚, 0) = 𝐴(𝑚 − 1, 1) pour 𝑚 > 0
*/
  }
  
}