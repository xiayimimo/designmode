package createtype.l2factorymethodpattern;

public class SymbianSystemFactory implements SoftwareFactory {

	
	@Override
	public SymbianOperation operationController() {
          return new SymbianOperation();
	}


}
