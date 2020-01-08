package createtype.l3abstractfactorypattern;

public class SymbianSystemFactory implements AbstractSoftwareFactory {

	
	@Override
	public SymbianOperation operationController() {
          return new SymbianOperation();
	}

	@Override
	public SymbianInterface interfaceController() {
		return new SymbianInterface();
	}

}
