public class Kadai06 {

	/**
	 * �ۑ�06
	 * �����Ƃ��ēn���ꂽ�z��̒��ŁA�~����2�Ԗڂ̒l��Ԃ�
	 * @param d ���l�������Ă���z��
	 * @return �z��̒��̍~����2�Ԗڂ̒l
	 */
	int get2ndMax(int[] d) {
		int max = d[0];
		for(int i = 1; i < d.length; i++) {
			if(max < d[i]) {
				max = d[i];
			}
		}
		int max2 = d[0];
		for (int i = 0; i < d.length; i++) {
			if (max2 ==max) {
				max2 =d[1];
			}
			for (int j = 0; j < d.length; j++) {
				if (d[j] != max) {


				}
			}
		}

		return max2;
	}
}
