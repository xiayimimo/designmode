package constructiontype.ll12flyweightpattern;

/**
 * 非共享享元类  需要时再创建，不放人享元池
 * @author ll
 *
 */
public class TwoDog extends Media {

	private static TwoDog instance = new TwoDog();
	
	@Override
	String getType() {
		return "文本";
	}
	
	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("尺寸为"+placeAndSize.getSize() + "的文本显示坐标为："+placeAndSize.getX()+placeAndSize.getY());
	}
	//返回享元对象类的唯一实例
		public static TwoDog getInstance() { 
			return instance; 
			}

}
