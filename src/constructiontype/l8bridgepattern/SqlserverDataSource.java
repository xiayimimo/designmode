package constructiontype.l8bridgepattern;

public class SqlserverDataSource implements DatabaseSelector {

	@Override
	public String getDataSource() {
		return "来自sqlserver的数据";
	}

}
