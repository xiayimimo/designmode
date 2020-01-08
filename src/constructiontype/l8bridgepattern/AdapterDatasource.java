package constructiontype.l8bridgepattern;

public class AdapterDatasource extends OracleDataSource {

	
	@Override
	public String getDataSource() {
		//此处省略具体适配类
		return "来自其他厂商提供的oracle数据源";
	}
}
