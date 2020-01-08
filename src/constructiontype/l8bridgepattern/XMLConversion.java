package constructiontype.l8bridgepattern;

public class XMLConversion extends DataConversion {

	@Override
	public void parseData(String str) {
		System.out.println("XMLչʾ"+databaseSelector.getDataSource()+str);
	}

}
