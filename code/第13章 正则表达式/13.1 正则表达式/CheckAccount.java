/**
 * 验证一个字符串是否是一个合法的账号
 * 规则：
 * 		1. 纯数字组成
 * 		2. 不能以0开头
 * 		3. 长度[6, 11]
 */
public class CheckAccount {
	public static void main(String[] args) {
		// 不使用正则表达式
		System.out.println(validateAccount("2513276112"));
		System.out.println(validateAccount("012.3"));
		
		// 使用正则表达式
		System.out.println(validateAccountWithRegex("h3ll0"));
		System.out.println(validateAccountWithRegex("28368346"));
	}
	
	public static boolean validateAccount(String account) {
		// 1. 纯数字组成
		int len = account.length();
		for(int i = 0; i < len; i++) {
			if(account.charAt(i) < '0' || account.charAt(i) > '9') {
				return false;
			}
		}
		
		// 2. 不能以0开头
		if(account.startsWith("0")) {
			return false;
		}
		
		// 3. 长度[6, 11]
		if(len < 6 || len > 11) {
			return false;
		}
		
		return true;
	}
	
	public static boolean validateAccountWithRegex(String account) {
		// 第1位数字为[1-9]，后面[0-9]可重复5-10次
		return account.matches("[1-9]\\d{5,10}");
	}		
}