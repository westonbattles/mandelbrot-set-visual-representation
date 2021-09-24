import java.awt.Color;

public enum Hue {
    RED(255, 0, 0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    BLACK(12,12,12),
    WHITE(255,255,255),
    
    ASPHALT(50,50,50),
    DARK_GREY(103,103,103),
    GREY(169,169,169),
    LIGHT_GREY(190,190,190),
    ALUMINUM(225,225,225),
    SILVER(210,210,210);

    ;
    
    private Color color;
  
    
    private Hue(int r, int g, int b){
        this.color = new Color(r,g,b);
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public Color getInverse(){
        int r = 255-this.color.getRed();
        int g = 255-this.color.getGreen();
        int b = 255-this.color.getBlue();
        return new Color(r,g,b);

    }
    
    
}