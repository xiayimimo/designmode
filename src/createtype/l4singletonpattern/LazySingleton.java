package createtype.l4singletonpattern;

//�����أ��̰߳�ȫ���������ܿ���
public class LazySingleton {

	private volatile static LazySingleton instance = null;

	private LazySingleton() {
	}

	// ˫�ؼ������
	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
