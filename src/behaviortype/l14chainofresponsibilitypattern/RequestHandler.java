package behaviortype.l14chainofresponsibilitypattern;
 
/**
 * 抽象请求处理者
 * @author ll
 *
 */
public abstract class RequestHandler {

	protected RequestHandler nextHandler;
	protected String name;
	public RequestHandler(String name){
		this.name = name;
	}
	public void setNextHandler(RequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}


	abstract void handlerRequest(int days);
}
