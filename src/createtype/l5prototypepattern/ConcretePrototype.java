package createtype.l5prototypepattern;

public class ConcretePrototype implements PrototypeS {
	private String attr;

	// 成员属性
	public void setAttr(String attr) {
		this.attr = attr;
	}

	public String getAttr() {
		return this.attr;
	}

	public PrototypeS clone() {
		// 克隆方法
		PrototypeS prototype = new ConcretePrototype();
		// 创建新对象
		//prototype.setAttr(this.attr);
		return prototype;
		// 对象的克隆——原型模式（一）
	}
}
