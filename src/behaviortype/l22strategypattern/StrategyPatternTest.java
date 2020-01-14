/**
 * ����ģʽ
 * 
 * Sunny�����˾������һ��ɻ�ģ��ϵͳ����ϵͳ��Ҫģ�ⲻͬ����ɻ��ķ�������������� ������Ҫģ��ķɻ����༰���������24-1��ʾ�� 
 * ��24-1 
 * �ɻ����༰����һ���� 
 * �ɻ�����                                    �������                                                        �������� 
 * ֱ����(Helicopter) ��ֱ���(VerticalTakeOff) �����ٷ���(SubSonicFly) 
 * �ͻ�(AirPlane) ���������(LongDistanceTakeOff) �����ٷ���(SubSonicFly)
 * �߻���(Fighter) ���������(LongDistanceTakeOff) �����ٷ���(SuperSonicFly) 
 * ��ʽս����(Harrier) ��ֱ���(VerticalTakeOff) �����ٷ���(SuperSonicFly) 
 * Ϊ�����ܹ�ģ���������ķɻ����Բ��ò���ģʽ��Ƹ÷ɻ�ģ��ϵͳ��
 */
/**
 * @author ¬��
 *
 */
package behaviortype.l22strategypattern;

public class StrategyPatternTest{
	
	public static void main(String[] args) {
		Airport airport = new Airport();
		//��������ʱ֪���������ͣ������ļ�
		PlaneType planeType = new Helicopter();
		airport.setPlaneType(planeType);
		airport.fly();
	}
}