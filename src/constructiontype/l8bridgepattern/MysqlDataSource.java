package constructiontype.l8bridgepattern;

public class MysqlDataSource implements DatabaseSelector {

	@Override
	public String getDataSource() {
		return "来自mysql的数据";
	}

}
