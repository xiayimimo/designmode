package constructiontype.ll10decoratorpattern;

public class SHA1Decorator extends AbstractDecorator {

	public SHA1Decorator(DataEncryption dataEncryption) {
		super(dataEncryption);
	}

	@Override
	String encode(String str) {
		return addedBehavior(super.encode(str));
	}

	public String addedBehavior(String str) {
		System.out.println("sha1º”√‹∫Û");
		System.out.println("sha1"+str);
		return "sha1"+str;
	}
}
