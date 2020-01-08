package constructiontype.l7adapterpattern;
/**
 * ∂‘œÛ  ≈‰∆˜
 */
public class EncryptionObjectAdapter implements EncryptionOperation {

	private Encryption encryption;
	
	
	public EncryptionObjectAdapter() {
		super();
		this.encryption = new Encryption();
	}
	@Override
	public String MD5(String str) {
		return encryption.MD5(str);
	}

	@Override
	public String BASE64(String str) {
		return encryption.BASE64(str);
	}

	@Override
	public String SHA1(String str) {
		return encryption.SHA1(str);
	}


}
