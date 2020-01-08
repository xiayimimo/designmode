package createtype.l2factorymethodpattern;

public class AndroidSystemFactory implements SoftwareFactory {

	@Override
	public Operation operationController() {
		return new AndroidOperation();
	}


}
