package constructiontype.ll12flyweightpattern;

public class Video extends Media {

	@Override
	String getType() {
		return "��Ƶ";
	}
	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("�ߴ�Ϊ"+placeAndSize.getSize() + "����Ƶ��ʾ����Ϊ��"+placeAndSize.getX()+placeAndSize.getY());
	}

}
