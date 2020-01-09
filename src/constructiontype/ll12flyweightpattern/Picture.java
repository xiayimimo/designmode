package constructiontype.ll12flyweightpattern;

public class Picture extends Media {

	@Override
	String getType() {
		return "图片";
	}

	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("尺寸为"+placeAndSize.getSize() + "的图片显示坐标为："+placeAndSize.getX()+placeAndSize.getY());
	}

}
