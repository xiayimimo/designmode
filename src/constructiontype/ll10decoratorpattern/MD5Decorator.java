package constructiontype.ll10decoratorpattern;

public class MD5Decorator extends AbstractDecorator {

	public MD5Decorator(DataEncryption dataEncryption) {
		super(dataEncryption);
	}
	@Override
	String encode(String str) {
		return addedBehavior(super.encode(str));
	}

	public String addedBehavior(String str) {
		System.out.println("md5º”√‹∫Û");
		System.out.println("md5"+str);
		return "md5"+str;
	}
	
}
