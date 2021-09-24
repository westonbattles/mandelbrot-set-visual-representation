public class Complex implements Comparable<Complex>{
    
    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);
    
    private final double real, imaginary;
    
    public Complex(double r, double i){
        
        this.real = r;
        this.imaginary = i;
        
        
    }
    
    public double get_real(){
        return this.real;
    }
    
    public double get_imaginary(){
        return this.imaginary;
    }
    
    
    public Complex negate(){
        return new Complex(-this.real, -this.imaginary);
    }
    
    public Complex add(Complex other){    
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new Complex(r, i);  
    }
    
    public Complex subtract(Complex other){
        double r = this.real - other.real;
        double i = this.imaginary - other.imaginary;
        return new Complex(r, i);
    }
    
    public Complex multiply(Complex other){
        double r = this.real * other.real - this.imaginary * other.imaginary;
        double i = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(r, i);
    }
    
    public Complex square(){
        return this.multiply(this);
    }
    
    public double modulusSquared(){
        return this.real*this.real + this.imaginary*this.imaginary;
    }
    
    public Complex divide(Complex other){
        double r = (this.real*other.real + this.imaginary*other.imaginary)/(other.real*other.real + other.imaginary*other.imaginary);
        double i = (this.imaginary*other.real - this.real*other.imaginary)/(other.real*other.real + other.imaginary*other.imaginary);
        return new Complex(r, i);
    }
    
    public Complex power(int n){
        if(n == 0) return ONE;
        
        Complex total = new Complex(this.real, this.imaginary);
        
        for(int i = 2; i <= n; i++){     
            total = total.multiply(this);   
        }
        return total;
    }
    
    public Complex conjugate(){
        return new Complex(this.real, -this.imaginary);
    }
    
    public double modulus(){
        return Math.sqrt(this.real*this.real + this.imaginary*this.imaginary);
    }
    
    
    
    @Override
    public String toString(){
        if(this.real == 0 && this.imaginary == 0) return "0";
        else if(this.imaginary == 0) return this.real+"";
        else if(this.real == 0) return this.imaginary+"i";
        
        String sign = " + ";
        if (this.imaginary<0) sign = " - ";
        
        return this.real+sign+Math.abs(this.imaginary)+"i";
    }
    
    @Override
    public int compareTo(Complex other) {
        
        boolean argIsGreater = Math.atan2(this.imaginary, this.real) > Math.atan2(other.imaginary, other.real);
        boolean otherIsGreater = Math.atan2(this.imaginary, this.real) < Math.atan2(other.imaginary, other.real);
        
        if(this.modulus()>other.modulus() || (this.modulus() == other.modulus() && argIsGreater)) return 1;
        else if(this.modulus()<other.modulus() || (this.modulus() == other.modulus() && otherIsGreater)) return -1;
        return 0;
        
    }
    
    @Override
    public boolean equals(Object other){
        return other instanceof Complex && this.equals(other);
    }
    
    public boolean equals(Complex other){
        return other != null && this.real == other.real && this.imaginary == other.imaginary;
    }
    
   
}
    


