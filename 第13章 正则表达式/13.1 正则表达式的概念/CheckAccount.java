/**
 * ��֤һ���ַ����Ƿ���һ���Ϸ����˺�
 * ����
 * 		1. ���������
 * 		2. ������0��ͷ
 * 		3. ����[6, 11]
 */
public class CheckAccount {
	public static void main(String[] args) {
		// ��ʹ��������ʽ
		System.out.println(validateAccount("2513276112"));
		System.out.println(validateAccount("012.3"));
		
		// ʹ��������ʽ
		System.out.println(validateAccountWithRegex("h3ll0"));
		System.out.println(validateAccountWithRegex("28368346"));
	}
	
	public static boolean validateAccount(String account) {
		// 1. ���������
		int len = account.length();
		for(int i = 0; i < len; i++) {
			if(account.charAt(i) < '0' || account.charAt(i) > '9') {
				return false;
			}
		}
		
		// 2. ������0��ͷ
		if(account.startsWith("0")) {
			return false;
		}
		
		// 3. ����[6, 11]
		if(len < 6 || len > 11) {
			return false;
		}
		
		return true;
	}
	
	public static boolean validateAccountWithRegex(String account) {
		// ��1λ����Ϊ[1-9]������[0-9]���ظ�5-10��
		return account.matches("[1-9]\\d{5,10}");
	}		
}