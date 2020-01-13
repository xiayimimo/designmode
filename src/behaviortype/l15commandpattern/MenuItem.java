package behaviortype.l15commandpattern;

public class MenuItem {
	
	private AbstractCommand abstractCommand;
	
	public void setAbstractCommand(AbstractCommand abstractCommand) {
		this.abstractCommand = abstractCommand;
	}
	/*//命令队列 菜单项可以包含多个命令
	private ArrayList<AbstractCommand> commands = new ArrayList<AbstractCommand>();
	public void addCommand(AbstractCommand command) { 
		commands.add(command); 
		}
	public void removeCommand(AbstractCommand command) { 
			commands.remove(command); 
			}
	//循环调用每一个命令对象的execute()方法
	public void execute() { 
		for (Object command : commands) { 
			((AbstractCommand)command).execute(); 
			} 
		}*/
	void execute() {
		this.abstractCommand.click();
	}
}
