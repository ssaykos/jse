
package oop06.lotto;

public class LottoServiceImpl implements LottoService {

	private int money;
	int[][] lottos; // 최종 결과
//	int[][] arr; // 안써도 됨(자유)

	@Override
	public void extractLottos(int money) {
		inputMoney(money);//
		int count = this.getCount(money);
		int i = 0;

		for (count = 0; count < lottos.length; count++) {
		//	while (true) {
				// 내부는 구현해주세요
				// isDuplication() 메소드 사용해야 합니다.
				// 중복되지 않은 숫자이면
				// lottos[count][i] = num 의
				// 형태로 들어가게 됩니다.
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
		lottos = new int[money / 1000 + 1][6];// 당첨번호를 0번째에 할당 할것이라 추가로 +1 햇다.
	}

	@Override
	public void printLotto() {
		String winLotto="당첨 로또 번호 -> ";
		String userLotto="고객 로또 번호 ->";
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
					// 완성해 주세요
					// 포털에
					// 스왑 알고리즘 검색하면
					// 다 나옵니다.
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

		return (int) (Math.ceil(money / 1000))+1;//로또 당첨번호 카운트 +1 추가
	}
}