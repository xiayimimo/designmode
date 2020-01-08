package createtype.l3abstractfactorypattern;

public class WindowsMobileSystemFactory implements AbstractSoftwareFactory {

	@Override
	public Operation operationController() {
		return new WindowsMobileOperation();
	}

	@Override
	public Interface interfaceController() {
		return new WindowsMobileInterface();
	}

}
