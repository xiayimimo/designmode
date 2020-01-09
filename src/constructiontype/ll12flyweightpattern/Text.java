package constructiontype.ll12flyweightpattern;

public class Text extends Media {

	private static Text instance = new Text();
	
	@Override
	String getType() {
		return "�ı�";
	}
	
	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("�ߴ�Ϊ"+placeAndSize.getSize() + "���ı���ʾ����Ϊ��"+placeAndSize.getX()+placeAndSize.getY());
	}
	//������Ԫ�������Ψһʵ��
		public static Text getInstance() { 
			return instance; 
			}

}
