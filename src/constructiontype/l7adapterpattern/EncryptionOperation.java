package constructiontype.l7adapterpattern;

public interface EncryptionOperation {
	String MD5(String str);
	String BASE64(String str);
	String SHA1(String str);
}
