/**
 * ����ģʽ
 * Զ�̴���\�������\��������\�������\�������ô���
 */
/**
 * @author ¬��
 *
 */
package constructiontype.ll13proxypattern;

public class ProxyPatternTest{
	
	public static void main(String[] args) {
		Search search = new SearchProxy();
		search.request("������");
	}
}