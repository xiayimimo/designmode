package createtype.l3abstractfactorypattern;

public class AndroidSystemFactory implements AbstractSoftwareFactory {

	@Override
	public Operation operationController() {
		return new AndroidOperation();
	}

	@Override
	public Interface interfaceController() {
		return new AndroidInterface();
	}

}
