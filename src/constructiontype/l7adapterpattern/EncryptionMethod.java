package constructiontype.l7adapterpattern;

/**
 * �����㷨
 * @author ll 
 *
 */
public interface EncryptionMethod {

	String MD5(String str);
	String BASE64(String str);
	String SHA1(String str);
}
