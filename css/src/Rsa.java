import java.math.BigInteger;
import java.math.*;
import java.util.Random;

	 

	 class Rsa {

	static BigInteger p,q,n,fiofn,e,d,n1,c,m;
		//int n;
	    public static void main(String[] args) {
   	     
   	     Random rand = new Random();
   	           m = new BigInteger("123");
      	 p = BigInteger.probablePrime(6, rand);
	     q = BigInteger.probablePrime(6, rand);
    	 n=p.multiply(q);
    	 System.out.println(p+" "+q+ " "+n);
    	 p=p.subtract(BigInteger.ONE);
    	 q=q.subtract(BigInteger.ONE);
    	 fiofn=p.multiply(q);

		 System.out.println(p+" "+q+ " "+fiofn);
	     
	     e = BigInteger.probablePrime(6, rand);
		 //int e=2;
	     while(fiofn.gcd(e).compareTo(BigInteger.ONE)>0 && e.compareTo(fiofn) < 0)
	     {
	     	e.add(BigInteger.ONE);
	     }

	     d=e.modInverse(fiofn);
	     System.out.println("d="+d);
	           
	     System.out.println("Encryption:-"+c);

	    }

	    
	     

	}