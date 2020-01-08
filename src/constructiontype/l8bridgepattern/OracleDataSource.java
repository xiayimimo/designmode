package constructiontype.l8bridgepattern;

public class OracleDataSource implements DatabaseSelector {

	@Override
	public String getDataSource() {
		return "来自oracle的数据";
	}

}
