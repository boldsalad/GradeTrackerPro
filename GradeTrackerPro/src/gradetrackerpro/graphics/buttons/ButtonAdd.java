package gradetrackerpro.graphics.buttons;
import java.awt.Color;
import java.awt.Graphics;
public class ButtonAdd extends AColorButton{
	private String message;
	public ButtonAdd(double x, double y, int width, int height, String message){
		super(x,y,width,height,"",new Color(0,0,0,75),new Color(0,0,0,125),new Color(0,0,0,175));
		this.message=message;
	}
	public void pushData(String title, String[] data){
		super.pushData("add-"+this.message,null);
	}
	public void render(Graphics g){
		g.setColor(super.color);
		g.fillRect((int)super.getX(),(int)super.getY()+super.getHeight()/2-super.getHeight()/8,super.getWidth(),super.getHeight()/4);
		g.fillRect((int)super.getX()+super.getWidth()/2-super.getWidth()/8,(int)super.getY(),super.getWidth()/4,super.getHeight()*3/8);
		g.fillRect((int)super.getX()+super.getWidth()/2-super.getWidth()/8,(int)super.getY()+super.getHeight()*5/8,super.getWidth()/4,super.getHeight()*3/8);
	}
}
