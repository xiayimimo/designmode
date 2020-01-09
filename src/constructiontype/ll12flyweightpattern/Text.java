package constructiontype.ll12flyweightpattern;

public class Text extends Media {

	private static Text instance = new Text();
	
	@Override
	String getType() {
		return "文本";
	}
	
	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("尺寸为"+placeAndSize.getSize() + "的文本显示坐标为："+placeAndSize.getX()+placeAndSize.getY());
	}
	//返回享元对象类的唯一实例
		public static Text getInstance() { 
			return instance; 
			}

}
