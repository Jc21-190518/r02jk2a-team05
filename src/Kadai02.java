
public class Kadai02 {

	/**
	 * �ۑ�02
	 * ������̒��ɁA�w�肳�ꂽ�A���t�@�x�b�g�������������Ă��邩��Ԃ����\�b�h
	 * @param s ������
	 * @param c ����
	 * @return s�̒��ɓ����Ă���c�̕�����
	 */
	int countString(String s,char c) {
		int count=0;

		for(char x: s.toCharArray()) {
			if(x == c) {
				count ++;
			}
		}
		return count;
	}
}
