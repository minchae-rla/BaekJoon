package day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_1316 {
	public static void main(String[] args) throws Exception {
		// 문제번호.1316
		// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
		// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹
		// 단어이지만,
		// aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
		// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count  = 0;

        for(int  i = 0; i  < N; i++){
            if(checkStr(br.readLine())){
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }

    static boolean checkStr(String str){
        //boolean형 배열에 초기값을 주지 않으면 모두 false로 들어간다.

        boolean[] checkAlpha = new boolean[26]; //입력받은 값이 영어임으로 영어의 개수만큼 배열 생성
        int prev = -1; //이전 문자의 인덱스값을 저장하는 변수

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i); //현재의 문자의 아스키 코드값을 저장

            if(prev != now){ //이전 문자와 i번째 문자가 같지 않다면
                if(checkAlpha[now-97] == false){ //false라는 것은 문자가 처음 나온 문자라는 것!
                    // 처음나왔음을 확인 했으니까 다음에 나오면 두번째로 나온 문자임으로 true로 바꿔준다.
                    checkAlpha[now-97] = true;
                    prev = now; //이전 문자와 비교 해야하므로 다음 반복문때에는 지금 문자가 이전문자가 되니까 확인

                }else{//아니라는 것은 이미 나온 적이 있는 경우 => 그룹 문자 X
                    return false; //더이상 반복문을 돌필요가 없기 때문에 반환값[false]을 준다.
                }
            }else{ //만약 이전 문자와 지금의 문자가 같다면 => 연속된 문자이므로 그냥 계속 반복문을 진행
                continue;
            }
        }
        return true; //여기까지 걸리지지 않았다는 것은 그룹문자라는 것! => true 반환
    }
}