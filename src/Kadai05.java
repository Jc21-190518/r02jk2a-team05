
public class Kadai05 {

	/**
	 * �ۑ�05
	 * �����Ƃ��ēn���ꂽ�z��̒��ŁA�ő�l��Ԃ�
	 * @param d ���l�������Ă���z��
	 * @return �z��̒��̍ő�l
	 */
	int getMax(int[] d) {
		int max =d[0];

		for(int i = 1; i < d.length; i++) {
			if(max < d[i]) {
				max = d[i];
			}
		}
		return max;
	}
}
