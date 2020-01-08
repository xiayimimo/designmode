package constructiontype.ll10decoratorpattern;

public abstract class AbstractDecorator extends DataEncryption {

	private DataEncryption dataEncryption;

	// ע��һ�����󹹼����͵Ķ���
	public AbstractDecorator(DataEncryption dataEncryption) {
		this.dataEncryption = dataEncryption;
	}

	@Override
	String encode(String str) {
		return dataEncryption.encode(str);
	}
    
}
