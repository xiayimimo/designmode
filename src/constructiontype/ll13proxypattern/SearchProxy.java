package constructiontype.ll13proxypattern;

public class SearchProxy extends Search {

	private RealSearch realSearch = new RealSearch();
	@Override
	void request(String str) {
		System.out.println("代理前");
		realSearch.request(str);
		System.out.println("代理后");
	}

}
