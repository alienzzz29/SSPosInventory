
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class FontCustom{

    private Font font;
    private GraphicsEnvironment ge;
    public Font getFont() {
        return font;
    }

    public FontCustom(String sFont) {
        
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
       
        
        if(sFont.equals("roboto-regular")){
            
            try {
                    font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/Roboto-Regular.ttf").openStream());
                    ge.registerFont(font);
            } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
            }
        }
        if(sFont.equals("roboto-light")){
            
            try {
                    font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/Roboto-Light.ttf").openStream());
                    ge.registerFont(font);
            } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
            }
        }
        if(sFont.equals("roboto-medium")){
            
            try {
                    font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/Roboto-Medium.ttf").openStream());
                    ge.registerFont(font);
            } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
            }
        }
        if(sFont.equals("roboto-bold")){
            
            try {
                    font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/Roboto-Bold.ttf").openStream());
                    ge.registerFont(font);
            } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
            }
        }
        if(sFont.equals("fa-solid")){
            
            try {
                    font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/Font-Awesome-5-Free-Solid-900.ttf").openStream());
                    ge.registerFont(font);
            } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
            }
        }
        if(sFont.equals("themify")){
            
            try {
                    font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/themify.ttf").openStream());
                    ge.registerFont(font);
            } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
            }
        }
    }
   

}