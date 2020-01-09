package constructiontype.ll12flyweightpattern;

/**
 * �ǹ�����Ԫ��  ��Ҫʱ�ٴ�������������Ԫ��
 * @author ll
 *
 */
public class TwoDog extends Media {

	private static TwoDog instance = new TwoDog();
	
	@Override
	String getType() {
		return "�ı�";
	}
	
	@Override
	void display(PlaceAndSize placeAndSize) {
		System.out.println("�ߴ�Ϊ"+placeAndSize.getSize() + "���ı���ʾ����Ϊ��"+placeAndSize.getX()+placeAndSize.getY());
	}
	//������Ԫ�������Ψһʵ��
		public static TwoDog getInstance() { 
			return instance; 
			}

}
