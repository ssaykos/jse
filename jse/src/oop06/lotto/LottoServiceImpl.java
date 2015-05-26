
package oop06.lotto;

public class LottoServiceImpl implements LottoService {

	private int money;
	int[][] lottos; // ���� ���
//	int[][] arr; // �Ƚᵵ ��(����)

	@Override
	public void extractLottos(int money) {
		inputMoney(money);//
		int count = this.getCount(money);
		int i = 0;

		for (count = 0; count < lottos.length; count++) {
		//	while (true) {
				// ���δ� �������ּ���
				// isDuplication() �޼ҵ� ����ؾ� �մϴ�.
				// �ߺ����� ���� �����̸�
				// lottos[count][i] = num ��
				// ���·� ���� �˴ϴ�.
				for (int j = 0; j < lottos[count].length; j++) {
					lottos[count][j]=getRandomNum();
					if(j>0){
						for (int j2 = 0; j2 < j; j2++) {
							if(lottos[count][j2]==lottos[count][j]){
								j2=0;
								lottos[count][j]=getRandomNum();
							}
						}
					}
				}
				sort(lottos[count]);
				if(count==getCount(money)){
					break;
				}
				
		//	}
		}
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money / 1000 + 1][6];// ��÷��ȣ�� 0��°�� �Ҵ� �Ұ��̶� �߰��� +1 �޴�.
	}

	@Override
	public void printLotto() {
		String winLotto="��÷ �ζ� ��ȣ -> ";
		String userLotto="�� �ζ� ��ȣ ->";
		for (int i = 0; i < lottos[0].length; i++) {
			winLotto+=" / "+lottos[0][i];
		}
		for (int i = 1; i < lottos.length; i++) {
			for (int j = 0; j < lottos[i].length; j++) {
				userLotto+=" / "+lottos[i][j];
			}
			if(lottos.length-1!=i){
				userLotto+="\n\t\t\t";
			}
		}
		System.out.println(winLotto);
		System.out.println(userLotto);
	}

	@Override
	public int getRandomNum() {
		return (int) ((Math.random() * 45) + 1);
	}

	@Override
	public boolean isDuplication() {
		return true;
	}

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// �ϼ��� �ּ���
					// ���п�
					// ���� �˰��� �˻��ϸ�
					// �� ���ɴϴ�.
					int temp = array[j];
					array[j]=array[j + 1];
					array[j + 1]=temp;
				}
			}
		}
	}

	@Override
	public int getCount(int money) {
		if (money < 1000)
			return 0;

		return (int) (Math.ceil(money / 1000))+1;//�ζ� ��÷��ȣ ī��Ʈ +1 �߰�
	}
}