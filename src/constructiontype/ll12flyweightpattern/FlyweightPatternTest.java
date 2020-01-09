/**
 * ��Ԫģʽ  ������Ԫģʽ  ������Ԫģʽ��������ģʽʵ�֣�
 * ��Ԫ����Ϲ���ģʽʵ�� ������Ԫ����
 * ��Ԫ������ϵ���ģʽʵ��
 * 
 * Sunny�����˾������һ���๦���ĵ��༭�������ı��ĵ��п��Բ���ͼƬ����������Ƶ �ȶ�ý�����ϣ�
 * Ϊ�˽�Լϵͳ��Դ����ͬ��ͼƬ����������Ƶ��ͬһ���ĵ���ֻ�豣�� һ�ݣ����ǿ��Զ���ظ����֣���������ÿ�γ���ʱλ�úʹ�С���ɲ�ͬ��
 * ��ʹ����Ԫ ģʽ��Ƹ��ĵ��༭����
 */
/**
 * @author ¬��
 *
 */
package constructiontype.ll12flyweightpattern;

public class FlyweightPatternTest{
	//������Ԫģʽ
	public static void main(String[] args) {
		MediaFactory mediaFactory = MediaFactory.getInstance();
		Media text = mediaFactory.getMedia("text");
		text.display(new PlaceAndSize(0, 0, 0));
		Media picture =  mediaFactory.getMedia("picture");
		Media video = mediaFactory.getMedia("video");
		Media text1 = mediaFactory.getMedia("text");
		text1.display(new PlaceAndSize(0, 0, 1));
		Media picture1 = mediaFactory.getMedia("picture");
		picture1.display(new PlaceAndSize(1, 1, 2));
		Media video1 = mediaFactory.getMedia("video");
		video1.display(new PlaceAndSize(2, 2, 3));
		System.out.println(text == text1);
		System.out.println(picture == picture1);
		System.out.println(video == video1);
		
	}
}