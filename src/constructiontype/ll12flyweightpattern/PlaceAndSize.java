package constructiontype.ll12flyweightpattern;

/**
 * λ�úʹ�С
 * @author admin
 *
 */
public class PlaceAndSize {
	private int x; 
	private int y; 
	private int size; 
	public PlaceAndSize(int x,int y,int size) { 
		this.x = x;
		this.y = y;
		this.size = size;
		}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
