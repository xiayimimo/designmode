package constructiontype.ll12flyweightpattern;

import java.util.HashMap;
/**
 * 享元工厂
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
	
	//返回享元工厂类的唯一实例
	public static MediaFactory getInstance() { 
		return instance; 
		}
	
	//通过key来获取存储在Hashtable中的享元对象
	public Media getMedia(String type) {
		return (Media)hashMapMedia.get(type); 
		}
}
