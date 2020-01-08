package constructiontype.l8bridgepattern;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
	// �÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean(String args) {
		try {
			// �����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\constructiontype\\l8bridgepattern\\config.xml"));

			// ��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = null;
			if(args.equals("type")) { 
				//��ȡ��һ�����������Ľڵ㣬�����������
				classNode=nl.item(0).getFirstChild(); 
				}else if(args.equals("source")) { 
					//��ȡ�ڶ������������Ľڵ㣬������ʵ���� 
				classNode=nl.item(1).getFirstChild();
				}
			String cName = classNode.getNodeValue();
			// ͨ����������ʵ�����󲢽��䷵��
			Class<?> c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			System.out.println("���䴴��ʵ��ʧ�ܣ�");
			e.printStackTrace();
			return null;
		}
	}
}
