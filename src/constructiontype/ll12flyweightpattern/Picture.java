package constructiontype.ll12flyweightpattern;

public class Picture extends Media {

	@Override
	String getType() {
		return "ͼƬ";
	}

	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("�ߴ�Ϊ"+placeAndSize.getSize() + "��ͼƬ��ʾ����Ϊ��"+placeAndSize.getX()+placeAndSize.getY());
	}

}
