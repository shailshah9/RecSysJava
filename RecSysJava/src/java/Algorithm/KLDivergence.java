package Algorithm;
/**
 *
 * @author Shail Shah
 */
public class KLDivergence {
    public static final double log2 = Math.log(2);
    /**
     * Returns the KL divergence, K(p1 || p2).
     *
     * The log is w.r.t. base 2. 
     *
     * If any value in p2 is 0.0 then the KL-divergence
     * is infinite. Limin changes it to zero instead of infinite. 
     * 
     */
    public static double klDivergence(double[] p1, double[] p2) {


      double klDiv = 0.0;

      for (int i = 0; i < p1.length; ++i) {
        if (p1[i] == 0) { continue; }
        if (p2[i] == 0.0) { continue; } // Limin

      klDiv += p1[i] * Math.log( p1[i] / p2[i] );
      }

      return klDiv / log2; // moved this division out of the loop -DM
    }
    
    public static void main(String[] arg0){
        double[] x={0.1,0.2,0.3,0.4};
        double[] y={0.15,0.2,0.4,0.25};
        System.out.println(klDivergence(x,y));
    }
}
