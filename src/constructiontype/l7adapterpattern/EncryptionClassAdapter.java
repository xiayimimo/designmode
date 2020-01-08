package constructiontype.l7adapterpattern;
/**
 * ¿‡  ≈‰∆˜
 */
public class EncryptionClassAdapter extends Encryption implements EncryptionOperation {

	@Override
	public String MD5(String str) {
		return super.MD5(str);
	}

	@Override
	public String BASE64(String str) {
		return super.BASE64(str);
	}

	@Override
	public String SHA1(String str) {
		return super.SHA1(str);
	}


}
