import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] friends = new char[n][n];

        for (int i = 0; i < n; i++) {
            friends[i] = sc.next().toCharArray();
        }

        int maxFriends = 0;

        // 모든 사람 i에 대해 2-친구 수를 구함 (완전 탐색)
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 자기 자신은 제외

                // 1. 직접 친구인 경우
                if (friends[i][j] == 'Y') {
                    count++;
                } 
                // 2. 한 명(k)을 거쳐서 친구인 경우 (건너건너 친구)
                else {
                    for (int k = 0; k < n; k++) {
                        if (friends[i][k] == 'Y' && friends[k][j] == 'Y') {
                            count++;
                            break; // 한 명이라도 다리가 있으면 2-친구이므로 중단
                        }
                    }
                }
            }
            maxFriends = Math.max(maxFriends, count);
        }

        System.out.println(maxFriends);
    }
}