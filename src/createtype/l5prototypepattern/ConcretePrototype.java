package createtype.l5prototypepattern;

public class ConcretePrototype implements PrototypeS {
	private String attr;

	// ��Ա����
	public void setAttr(String attr) {
		this.attr = attr;
	}

	public String getAttr() {
		return this.attr;
	}

	public PrototypeS clone() {
		// ��¡����
		PrototypeS prototype = new ConcretePrototype();
		// �����¶���
		//prototype.setAttr(this.attr);
		return prototype;
		// ����Ŀ�¡����ԭ��ģʽ��һ��
	}
}
