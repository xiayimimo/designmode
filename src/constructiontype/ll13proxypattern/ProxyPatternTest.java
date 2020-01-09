/**
 * 代理模式
 * 远程代理\虚拟代理\保护代理\缓冲代理\智能引用代理
 */
/**
 * @author 卢亮
 *
 */
package constructiontype.ll13proxypattern;

public class ProxyPatternTest{
	
	public static void main(String[] args) {
		Search search = new SearchProxy();
		search.request("哈哈哈");
	}
}