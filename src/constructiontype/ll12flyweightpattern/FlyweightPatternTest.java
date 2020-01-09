/**
 * 享元模式  单纯享元模式  复合享元模式（配合组合模式实现）
 * 享元池配合工厂模式实现 单例享元工厂
 * 享元对象配合单例模式实现
 * 
 * Sunny软件公司欲开发一个多功能文档编辑器，在文本文档中可以插入图片、动画、视频 等多媒体资料，
 * 为了节约系统资源，相同的图片、动画和视频在同一个文档中只需保存 一份，但是可以多次重复出现，而且它们每次出现时位置和大小均可不同。
 * 试使用享元 模式设计该文档编辑器。
 */
/**
 * @author 卢亮
 *
 */
package constructiontype.ll12flyweightpattern;

public class FlyweightPatternTest{
	//单纯享元模式
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