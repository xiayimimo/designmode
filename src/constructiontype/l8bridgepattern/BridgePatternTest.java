/**
 * �Ž�ģʽ
 * Sunny�����˾������һ������ת�����ߣ����Խ����ݿ��е�����ת���ɶ����ļ���ʽ�� ����txt��xml��pdf�ȸ�ʽ��
 * ͬʱ�ù�����Ҫ֧�ֶ��ֲ�ͬ�����ݿ⡣��ʹ���Ž�ģʽ�� �������ơ�
 * 
 * ��չ���Ž�ģʽ���������ģʽʹ�� �����������ṩoracle����Դ
 */
/**
 * @author ll
 *
 */
package constructiontype.l8bridgepattern;

public class BridgePatternTest{
	
	public static void main(String[] args) {
		DataConversion DataConversion = (constructiontype.l8bridgepattern.DataConversion) XMLUtil.getBean("type");
		DatabaseSelector databaseSource = (DatabaseSelector) XMLUtil.getBean("source");
		DataConversion.setDatabaseSelector(databaseSource);
		DataConversion.parseData("��Ұ������");
	}
}