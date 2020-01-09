package constructiontype.ll11facadepattern;


/**
 * ���������
 * @author ¬��
 *
 */
public class EncryptFacade extends AbstractEncryptFacade {
	private SubRead reader; 
	private CipherMachine cipher;
	private SubWrite writer; 
	public EncryptFacade() { 
		
		}
	
	@Override
	public void FileEncrypt(String fileNameSrc, String fileNameDes) { 
		cipher = new CipherMachine(); 
		reader = new SubRead();
		writer = new SubWrite();
		System.out.println(reader.read(fileNameSrc)); 
		System.out.println(cipher.encrypt(fileNameSrc));
		System.out.println(writer.write(fileNameDes));
		}

}
