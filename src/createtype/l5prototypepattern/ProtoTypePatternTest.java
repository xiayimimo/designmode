/**
 * ԭ��ģʽ
 * ��Ʋ�ʵ��һ���ͻ���Customer�����а���һ����Ϊ�ͻ���ַ�ĳ�Ա�������ͻ���ַ���� ��ΪAddress��
 * ��ǳ��¡�����¡�ֱ�ʵ��Customer����ĸ��Ʋ��Ƚ������ֿ�¡��ʽ�� ��ͬ��
 */
/**
 * @author ll
 *
 */
package createtype.l5prototypepattern;

public class ProtoTypePatternTest {
	public static void main(String args[]) {
		ProtoType log_previous = new ProtoType();
		// ����ԭ�Ͷ���
		log_previous.setName("���޼�");
		log_previous.setDate("��12��");
		log_previous.setContent("���ܹ�����æ��ÿ��Ӱ࣡");
		System.out.println("****�ܱ�****");
		System.out.println("�ܴΣ�" + log_previous.getDate());
		System.out.println("������" + log_previous.getName());
		System.out.println("���ݣ�" + log_previous.getContent());
		System.out.println("--------------------------------");
		ProtoType log_new;
		log_new = log_previous.clone();
		// ���ÿ�¡����������¡����
		log_new.setDate("��13��");
		System.out.println("****�ܱ�****");
		System.out.println("�ܴΣ�" + log_new.getDate());
		System.out.println("������" + log_new.getName());
		System.out.println("���ݣ�" + log_new.getContent());
		
		System.out.println(log_previous == log_new); //false
		System.out.println(log_previous.getDate() == log_new.getDate());//false
		System.out.println(log_previous.getName() == log_new.getName()); //true ���ɱ��ַ���
		System.out.println(log_previous.getContent() == log_new.getContent());//true ���ɱ��ַ���
	}
}
