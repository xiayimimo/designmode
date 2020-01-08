/**
 * 桥接模式
 * Sunny软件公司欲开发一个数据转换工具，可以将数据库中的数据转换成多种文件格式， 例如txt、xml、pdf等格式，
 * 同时该工具需要支持多种不同的数据库。试使用桥接模式对 其进行设计。
 * 
 * 扩展：桥接模式配合适配器模式使用 ，其他厂商提供oracle数据源
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
		DataConversion.parseData("沃野布吉岛");
	}
}