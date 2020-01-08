package createtype.l2factorymethodpattern;

public class WindowsMobileSystemFactory implements SoftwareFactory {

	@Override
	public Operation operationController() {
		return new WindowsMobileOperation();
	}

}
