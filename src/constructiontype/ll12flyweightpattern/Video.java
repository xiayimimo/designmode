package constructiontype.ll12flyweightpattern;

public class Video extends Media {

	@Override
	String getType() {
		return "视频";
	}
	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("尺寸为"+placeAndSize.getSize() + "的视频显示坐标为："+placeAndSize.getX()+placeAndSize.getY());
	}

}
