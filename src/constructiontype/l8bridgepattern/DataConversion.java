package constructiontype.l8bridgepattern;

public abstract class DataConversion {

	protected DatabaseSelector databaseSelector;
	
	public void setDatabaseSelector(DatabaseSelector databaseSelector){
		this.databaseSelector =databaseSelector;
	}
	public abstract void parseData(String str);
}
