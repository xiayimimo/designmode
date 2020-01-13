package behaviortype.l15commandpattern;

public class MenuItem {
	
	private AbstractCommand abstractCommand;
	
	public void setAbstractCommand(AbstractCommand abstractCommand) {
		this.abstractCommand = abstractCommand;
	}
	/*//������� �˵�����԰����������
	private ArrayList<AbstractCommand> commands = new ArrayList<AbstractCommand>();
	public void addCommand(AbstractCommand command) { 
		commands.add(command); 
		}
	public void removeCommand(AbstractCommand command) { 
			commands.remove(command); 
			}
	//ѭ������ÿһ����������execute()����
	public void execute() { 
		for (Object command : commands) { 
			((AbstractCommand)command).execute(); 
			} 
		}*/
	void execute() {
		this.abstractCommand.click();
	}
}
