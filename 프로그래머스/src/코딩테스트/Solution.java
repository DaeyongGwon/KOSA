package 코딩테스트;

public class Solution {

	public int solution(int[][] board) {
		int answer = 0;

		// 보드보다 2칸크게 만듦 
		int[][] map = new int[board.length + 2][board[0].length + 2];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				map[i + 1][j + 1] = board[i][j];
			}
		}
		//위 9번부터 
		
		for (int i = 1; i < map.length - 1; i++) {
			for (int j = 1; j < map[0].length - 1; j++) {
				// 0일떄 카운트용 
				if (map[i][j] == 0) {
					int cnt = 0;
					for (int k = i - 1; k <= i + 1; k++) {
						for (int l = j - 1; l <= j + 1; l++) {
							if (map[k][l] == 1) {
								cnt++;
							}
						}
					}
					if (cnt == 0) {
						answer++;
					}
				}
			}
			
		}
		return answer;
		
	}
}
