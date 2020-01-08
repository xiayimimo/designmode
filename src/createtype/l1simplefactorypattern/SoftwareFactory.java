package createtype.l1simplefactorypattern;

public class SoftwareFactory {

	public static Operation getOperation(String Software) throws Exception{
		if("Android".equals(Software)){
			return new AndroidOperation();
		}else if("Symbian".equals(Software)){
			return new SymbianOperation();
		}else if("WindowsMobile".equals(Software)){
			return new WindowsMobileOperation();
		}else{
		 throw new Exception("该系统操作不存在！");
		}
	}
}
