package constructiontype.l8bridgepattern;

public class ExcelConversion extends DataConversion {

	@Override
	public void parseData(String str) {
		System.out.println("Excelչʾ"+databaseSelector.getDataSource()+str);
	}

}
