public class Mandelbrot {
    
    private int max;
    
    public Mandelbrot(int m){
        
        this.max = m;
        
    }
     
    public Mandelbrot(){
        
    }
    
    //Function that checks to see if a given complex number is in the mandelbrot set
    
    public boolean isInMandelbrotSet(Complex c){
        
        
        Complex z = Complex.ZERO;
        
        for(int i = 0; i < this.max; i++){
            
            z = z.square().add(c);

            if (z.modulusSquared() > 4){
                return false;
            }           
        }
        
        return true;
        
    }
    
    public int escapeTime(Complex c){

        Complex z = Complex.ZERO;
        
        for(int i = 0; i < this.max; i++){
            
            z = z.square().add(c);
            
            if (z.modulusSquared() > 4){
                return i;
            }           
        }
        return -1;
    }   
    
}