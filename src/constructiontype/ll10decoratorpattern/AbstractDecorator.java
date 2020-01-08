package constructiontype.ll10decoratorpattern;

public abstract class AbstractDecorator extends DataEncryption {

	private DataEncryption dataEncryption;

	// 注入一个抽象构件类型的对象
	public AbstractDecorator(DataEncryption dataEncryption) {
		this.dataEncryption = dataEncryption;
	}

	@Override
	String encode(String str) {
		return dataEncryption.encode(str);
	}
    
}
