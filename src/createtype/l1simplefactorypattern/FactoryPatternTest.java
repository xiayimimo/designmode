/**
 * �򵥹���ģʽ ��������չ,�����Ͽ���ԭ����չ��Ҫ�޸����������
 */
/**
 * @author ll
 *
 */
package createtype.l1simplefactorypattern;

public class FactoryPatternTest{
	public static void main(String[] args) throws Exception {
		SoftwareFactory.getOperation("Android").operation();
		SoftwareFactory.getOperation("nima").operation();
	}
}