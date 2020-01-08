package constructiontype.l8bridgepattern;

public class PDFConversion extends DataConversion {

	@Override
	public void parseData(String str) {
		System.out.println("PDFչʾ"+databaseSelector.getDataSource()+str);
	}

}
