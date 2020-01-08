package createtype.l4singletonpattern;

/**
 * ��϶���ʽ������ʽ�ŵ�
 * Initialization Demand Holder (IoDH)�ļ���
 * @author ll
 *
 */
public class IoDH {

	private IoDH(){
	}
	private static class HolderClass{
		private static final IoDH instance = new IoDH();
	}
	public static IoDH getInstance(){
		return HolderClass.instance;
	}
	
	public static void main(String[] args) {
		IoDH s1,s2;
		s1 = IoDH.getInstance();
		s2 = IoDH.getInstance();
		System.out.println(s1 == s2);
	}
}
