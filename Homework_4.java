public class Homework_4 {
    
    
    private static int height;
    private static int width;
    private static int limit;
    
    private static float xmin;
    private static float xmax;
    private static float ymin;
    private static float ymax;

    private static Hue in;
    private static Hue out;

    

    public static void main(String[] args) {
        
        height = 900;
        width = 1600;
        limit = 1000;
        
        xmin = -1.8f;
        xmax = 1.8f;
        ymin = -1.3f;
        ymax = 1.3f;

        
        in = Hue.BLACK;
        out = Hue.ASPHALT;
        
        String expecting = "";
        
        for(String arg : args){
            
            
            
            switch(arg){
                
                case("-width"):
                    expecting = "width";
                    break;
                   
                case("-height"):
                    expecting = "height";
                    break;
                    
                case("-limit"):
                    expecting = "limit";
                    break;
                
                case("-xmin"):
                    expecting = "xmin";
                    break;
                
                case("-xmax"):
                    expecting = "xmax";
                    break;
                
                case("-ymin"):
                    expecting = "ymin";
                    break;
                
                case("-ymax"):
                    expecting = "ymax";
                    break;
                
                case("-in"):
                    expecting = "in";
                    break;
                
                case("-out"):
                    expecting = "out";
                    break;
                
                    
            }
            
            switch(expecting){
                
                case("width"):
                    
                    try{
                        width=Integer.parseInt(arg);
                    } catch (Exception e) {
                        //System.err.println("Invalid type assigned to variable width, resulting to default...");
                    }
                    
                    break;
                   
                case("height"):
                    
                    try{
                        height=Integer.parseInt(arg);
                    } catch (Exception e) {
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Invalid type assigned to variable height, resulting to default...");
                        }
                    }
                    
                    break;
                    
                case("limit"):
                    
                    try{
                        limit=Integer.parseInt(arg);
                    } catch (Exception e) {
                        
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Invalid type assigned to variable limit, resulting to default...");
                        }
                    }
                
                    break;
                    
                case("xmin"):
                    try{
                        xmin=Float.parseFloat(arg);
                    } catch (Exception e) {
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Invalid type assigned to variable xmin, resulting to default...");
                        }
                    }
                    
                    break;
                    
                case("xmax"):
                    try{
                        xmax=Float.parseFloat(arg);
                    } catch (Exception e) {
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Invalid type assigned to variable xmax, resulting to default...");
                        }
                    }
                    
                    break;
                
                case("ymin"):
                    try{
                        ymin=Float.parseFloat(arg);
                    } catch (Exception e) {
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Invalid type assigned to variable ymin, resulting to default...");
                        }
                    }
                    
                    break;
                
                case("ymax"):
                    try{
                        ymax=Float.parseFloat(arg);
                    } catch (Exception e) {
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Invalid type assigned to variable ymax, resulting to default...");
                        }
                    }
                    
                    break;
                
                case("in"):
                    
                    try{
                        in=Hue.valueOf(arg);
                    } catch (Exception e) {
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Color " + arg + " not found in class Hue, resulting to default...");
                        }
                    }
                    
                    break;
                
                case("out"):
                    
                    try{
                        out=Hue.valueOf(arg);
                    } catch (Exception e) {
                        if(!arg.equals("-"+expecting)){
                            System.err.println("Color " + arg + " not found in class Hue, resulting to default...");
                        }
                    }
                    
                    break;
                
                    
            }
        }
        
        
        
        Mandelbrot m = new Mandelbrot(limit);
        
        Canvas canvas = new Canvas(height, width);
        canvas.setXRange(xmin, xmax);
        canvas.setYRange(ymin, ymax);
        double xstep = (xmax - xmin) / width;
        double ystep = (ymax - ymin) / height;
        for (double x = xmin; x < xmax; x += xstep) {
            for (double y = ymin; y < ymax; y += ystep) {
                // set the point x, y to be the desired color
                
                Complex c = new Complex(x,y);
                
                        
                
                if (m.isInMandelbrotSet(c) || m.escapeTime(c) > 50){
                    
                    int num = 0;
                    
                    if(x < 0){
                        num += 3; 
                    }
                    
                    
                    //Creates stripes
                    if(((x+num)*100)%10>5){
                        canvas.set(x, y, in.getInverse());
                        
                    } else {
                        canvas.set(x, y, in.getColor());
                    }
                    
                    
                    
                    
                }
               
                
                
                else if(m.escapeTime(c) > 30){ 
                    
                    canvas.set(x, y, Hue.BLACK.getColor());
                }
                
                else if(m.escapeTime(c) > 18){
                    
                    canvas.set(x, y, Hue.DARK_GREY.getColor());
                }
                
                else if(m.escapeTime(c) > 13){
                    canvas.set(x, y, Hue.GREY.getColor());
                }
                
                else if(m.escapeTime(c) > 11){
                    canvas.set(x, y, Hue.LIGHT_GREY.getColor());
                }
                
                else if(m.escapeTime(c) > 9){
                    canvas.set(x, y, Hue.SILVER.getColor());
                }
                
               
                
                else {
                    
                    /*int rand = (int)(Math.random()*80)+1;
                    if(rand==80){
                        canvas.set(x, y, out.getInverse());

                    }
                    else {
                        canvas.set(x, y, out.getColor());
                    }*/
                    
                    //if((Math.abs(y)*100)%10 > 5){
                      //  canvas.set(x, y, out.getInverse());
                    //}
                    
                    
                    canvas.set(x, y, out.getColor());
                    
                } 
                
                
                
              
            }
        }
        canvas.display("Tear in the wallpaper"); 
    }
    
}