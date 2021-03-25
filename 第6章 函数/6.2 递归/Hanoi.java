public class Hanoi {
	public static int move = 0;			// �ƶ�����
	
	public static void main(String[] args) {
		hanoi(4, 'A', 'B', 'C');
		System.out.println("����==>" + move);
	}
	
	/**
	 * @brief  ��ŵ���㷨
	 * @note   �� n �����Ӵ� src ���� mid �Ƶ� dst
	 * @param  n: ����
	 * @param  src: �������
	 * @param  mid: ��ʱ����
	 * @param  dst: Ŀ������
	 */
	public static void hanoi(int n, char src, char mid, char dst) {
	    if(n == 1) {
	    	System.out.println(n + "���̣�" + src + "->" + dst);
	        move++;
	    } else {
	        // ��ǰ n-1 �����Ӵ� src ���� dst �Ƶ� mid
	        hanoi(n-1, src, dst, mid);
	        // �ƶ��� n ������
	        System.out.println(n + "���̣�" + src + "->" + dst);
	        move++;
	        // �Ѹղŵ� n-1 �����Ӵ� mid ���� src �Ƶ� dst
	        hanoi(n-1, mid, src, dst);
	    }
	}
}