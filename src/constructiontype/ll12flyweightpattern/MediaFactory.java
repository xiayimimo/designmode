package constructiontype.ll12flyweightpattern;

import java.util.HashMap;
/**
 * ��Ԫ����
 * @author ll
 *
 */
public class MediaFactory {

	private static MediaFactory instance = new MediaFactory();
	
	private static HashMap<String, Media> hashMapMedia ;
	
	private MediaFactory() {
		hashMapMedia = new HashMap<>(); 
		Media text,picture,video;
		text = Text.getInstance(); 
		picture = new Picture(); 
		video = new Video(); 
		hashMapMedia.put("text",text); 
		hashMapMedia.put("picture",picture); 
		hashMapMedia.put("video",video); 
	}
	
	//������Ԫ�������Ψһʵ��
	public static MediaFactory getInstance() { 
		return instance; 
		}
	
	//ͨ��key����ȡ�洢��Hashtable�е���Ԫ����
	public Media getMedia(String type) {
		return (Media)hashMapMedia.get(type); 
		}
}
