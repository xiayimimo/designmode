package constructiontype.l7adapterpattern;

public class Encryption implements EncryptionMethod {

	@Override
	public String MD5(String str) {
		return "MD5"+str;
	}

	@Override
	public String BASE64(String str) {
		return "BASE64"+str;
	}

	@Override
	public String SHA1(String str) {
		return "SHA1"+str;
	}

}
