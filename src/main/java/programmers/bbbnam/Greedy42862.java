package programmers.bbbnam;

public class Greedy42862 {
    public int solution(int n, int[] lost, int[] reserve){
        //n 전체 학생수
        //lost 도난당한 학생수
        //reserve 여벌 옷 가진 학생수
        int answer = 0;
        int lostIndex = 0;
        for (int i= 0; i < reserve.length; i ++){
            for (int t = 0; t < lost.length; t++){
                if (reserve[i] == lost[t]){ // 잃어버린 학생과 여벌옷이 있는 학생이 동일인일 경우
                    makeOffset(lost, reserve, i, t);
                    continue;
                }
                if (reserve[i] + 1 == lost[t]){ //자신보다 뒷번호에 빌려줄수 있는 경우
                    makeOffset(lost, reserve, i, t);
                    continue;
                }
                if (reserve[i] - 1 == lost[t]){ //자신보다 앞번호에 빌려줄수 있는 경우
                    makeOffset(lost, reserve, i, t);
                    continue;
                }
            }
        }
        for (int f = 0; f < lost.length; f++){
            // System.out.println("lost>>"+lost[f]);
            if (lost[f] != -1){
                lostIndex ++;
            }
        }
        answer = n - lostIndex;

        return answer;
    }

    private void makeOffset(int[] lost, int[] reserve, int i, int t) {
        //상쇄 메소드
        lost[t] = -1; //  -1은 제외의 의미
        reserve[i] = -1;
    }


}
