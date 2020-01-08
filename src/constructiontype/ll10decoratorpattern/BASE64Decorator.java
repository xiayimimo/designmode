package constructiontype.ll10decoratorpattern;

public class BASE64Decorator extends AbstractDecorator {

	public BASE64Decorator(DataEncryption dataEncryption) {
		super(dataEncryption);
	}

	@Override
	String encode(String str) {
		return addedBehavior(super.encode(str));
	}

	public String addedBehavior(String str) {
		System.out.println("base64º”√‹∫Û");
		System.out.println("base64"+str);
		return "base64"+str;
	}
}
