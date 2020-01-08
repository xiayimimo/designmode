package createtype.l5prototypepattern;

public class ProtoType implements Cloneable { 
	private String name; 
	private String date; 
	private String content; 
	public void setName(String name) { 
		this.name = name; 
		}
	public void setDate(String date) { 
		this.date = date; 
		}
	public void setContent(String content) {
		this.content = content; 
		}
	public String getName() { 
		return (this.name); 
		}
	public String getDate() { 
		return (this.date); 
		}
	public String getContent() { 
		return (this.content); 
		} 
	//��¡����clone()���˴�ʹ��Java�����ṩ�Ŀ�¡����
	public ProtoType clone() { 
		Object obj = null; 
		try { 
			obj = super.clone(); 
			return (ProtoType)obj; 
			}catch(CloneNotSupportedException e) { 
				System.out.println("��֧�ָ��ƣ�");
				return null; 
				} 
		} 
}
	