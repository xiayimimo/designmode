package createtype.l4singletonpattern;

//懒加载，线程安全，额外性能开销
public class LazySingleton {

	private volatile static LazySingleton instance = null;

	private LazySingleton() {
	}

	// 双重检查锁定
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
