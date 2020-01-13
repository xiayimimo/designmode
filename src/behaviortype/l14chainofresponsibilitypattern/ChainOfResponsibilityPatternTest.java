/**
 * 职责链模式  纯的职责链模式 不纯的职责链模式
 * 
 * 
 * Sunny软件公司的OA系统需要提供一个假条审批模块：如果员工请假天数小于3天，主任 可以审批该假条；
 * 如果员工请假天数大于等于3天，小于10天，经理可以审批；如果员工 请假天数大于等于10天，小于30天，总经理可以审批；
 * 如果超过30天，总经理也不能审 批，提示相应的拒绝信息。试用职责链模式设计该假条审批模块。
 */
/**
 * @author 卢亮
 *
 */
package behaviortype.l14chainofresponsibilitypattern;

public class ChainOfResponsibilityPatternTest{
	
	public static void main(String[] args) {
		RequestHandler director,manager,leader,meeting;
		director = new Director("主任");
		manager = new Manager("经理");
		leader = new Leader("总经理");
		meeting = new Meeting("开会");
		director.setNextHandler(manager);
		manager.setNextHandler(leader);
		leader.setNextHandler(meeting);
		director.handlerRequest(29);
	}
	
	
}