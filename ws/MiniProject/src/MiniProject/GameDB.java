package MiniProject;

import java.util.Random;
import java.util.Scanner;

public class GameDB {
    public void playGame(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int usersel, comsel, sel;
        int winCnt = 0, loseCnt = 0, drawCnt = 0, roundCnt = 0, gameCnt = 0;
        int winR = 0, winP = 0, winS = 0;
        int loseR = 0, loseP =0, loseS = 0;
        String yn;

        while(true){
            System.out.println("=====================두둥탁! 게임시작=====================");
            for(int i = 0; i < 3; i++){
                System.out.println("\t1. 가위 2. 바위 3. 보 0. 게임종료");
                System.out.print("\t\t고민 후 선택해주세요. > ");
                usersel = sc.nextInt();
                comsel = rd.nextInt(3)+1;
                if(usersel == 0){
                    sc.nextLine();
                    System.out.println("\t정말로 종료해요 ? ㅠㅠ y / n");
                    yn = sc.nextLine().trim().toLowerCase();
                    if(yn.equals("y")) {
                        System.out.println("\t구럼 시스템 종료할게요! 다음에 또 봐요 ! ");
                        System.exit(0);
                    }
                    if(yn.equals("n")){
                        System.out.println("\t헷 다행이당 ! 더 놀아요 !");
                        break;
                    }
                }
                switch (usersel){
                    case 1:
                        System.out.print("\t\t유저 : 가위 ");
                        break;
                    case 2:
                        System.out.print("\t\t유저 : 바위 ");
                        break;
                    case 3:
                        System.out.print("\t\t유저 : 보 ");
                        break;
                    default:
                        System.out.println("\t\t메뉴에 해당되는 숫자만 눌러주세요 ^^~");
                        continue;
                }
                switch (comsel){
                    case 1:
                        System.out.print("vs. 컴 : 가위");
                        break;
                    case 2:
                        System.out.print("vs. 컴 : 바위");
                        break;
                    case 3:
                        System.out.print("vs. 컴 : 보");
                        break;
                }


                System.out.println("");
                for(int j = 1; j < 4; j++){ //비김
                    if(usersel == j && comsel == j){
                        System.out.println("\t\t ***비겼습니다.***");
                        System.out.println("=====================================================");
                        drawCnt++;
                    }
                }
                if(usersel == 1 && comsel ==3){ //가위 > 보
                    System.out.println("\t\t ***이겼습니다.***");
                    System.out.println("=====================================================");
                    winS++;
                    winCnt++;
                }
                if(usersel == 1 && comsel ==2){ //가위 < 바위
                    System.out.println("\t\t ***졌습니다 ㅠㅠ ***");
                    System.out.println("=====================================================");
                    loseS++;
                    loseCnt++;
                }
                if(usersel == 2 && comsel ==3){ //바위 < 보
                    System.out.println("\t\t ***졌습니다 ㅠㅠ ***");
                    System.out.println("=====================================================");
                    loseR++;
                    loseCnt++;
                }
                if(usersel == 2 && comsel ==1){ //바위 > 가위
                    System.out.println("\t\t ***이겼습니다.***");
                    System.out.println("=====================================================");
                    winR++;
                    winCnt++;
                }
                if(usersel == 3 && comsel == 2){ //보>바위
                    System.out.println("\t\t ***이겼습니다.***");
                    System.out.println("=====================================================");
                    winP++;
                    winCnt++;
                }
                if(usersel == 3 && comsel == 1){ //보 < 가위
                    System.out.println("\t\t ***졌습니다 ㅠㅠ ***");
                    System.out.println("=====================================================");
                    loseP++;
                    loseCnt++;
                }
                gameCnt++;
            }
            roundCnt++;
            System.out.println("\t***" + roundCnt + "라운드 끝 ! 메뉴선택하세요 ! ***");
            System.out.println("=====================================================");
            while(true) {
                System.out.println("1. 게임 더 하기 2. 간단승률 확인 3. 상세승률 확인 0. 게임 종료하기 >");
                sel = sc.nextInt();
                if (sel == 1) {
                    break;
                } else if (sel == 2) {
                    System.out.println("=====================간단 승률 확인=====================");
                    System.out.println("\t시행한 라운드 : " + roundCnt);
                    System.out.println("\t이긴 횟수 : " + winCnt);
                    System.out.println("\t비긴 횟수 : " + drawCnt);
                    System.out.println("\t진 횟수 : " + loseCnt);
                    System.out.println();
                    double winper = (((double) winCnt / (double) gameCnt) * 100);
                    System.out.printf("\t현재승률: "+ "%.2f", winper);
                    System.out.print("%");
                    System.out.println("");
                    System.out.println("=====================================================");

                } else if (sel == 3) {
                    System.out.println("=====================상세 승률 확인=====================");
                    System.out.println("\t  **" + winCnt + "승 " + loseCnt + "패 " + drawCnt + "무 **");
                    System.out.println("=====================================================");
                    System.out.println("\t가위로 이긴 횟수: " + winS + "번");
                    try {
                        double winSPer = (double) winS / (double) winCnt;
                        System.out.printf("\t가위승률: "+ "%.2f", winSPer);
                        System.out.print("%");
                        System.out.println("");
                        System.out.println("=====================================================");
                    }catch (ArithmeticException e){
                        System.out.println("\t가위 승률: 0.00%");
                        System.out.println("=====================================================");
                    }
                    System.out.println("\t바위로 이긴 횟수: " + winR + "번");
                    try{
                        double winRPer = (double) winR / (double) winCnt;
                        System.out.printf("\t바위승률: "+ "%.2f", winRPer);
                        System.out.print("%");
                        System.out.println("");
                        System.out.println("=====================================================");
                    } catch (ArithmeticException e){
                        System.out.println("\t바위 승률: 0.00%");
                        System.out.println("=====================================================");
                    }
                    System.out.println("\t보자기로 이긴 횟수: " + winP + "번");
                    try{
                        double winPPer = (double) winP / (double) winCnt;
                        System.out.printf("\t보자기승률: "+ "%.2f", winPPer);
                        System.out.print("%");
                        System.out.println("");
                        System.out.println("=====================================================");
                    } catch (ArithmeticException e){
                        System.out.println("\t 보자기 승률: 0.00%");
                        System.out.println("=====================================================");
                    }
                    if (winS > (winR + winP)) {
                        System.out.println("\t***가위 승률이 1등 !***");
                        System.out.println("다음에는 [가위]를 더 내어 보세요 ^_^v");
                        System.out.println("=====================================================");
                    } else if (winR > (winS + winP)) {
                        System.out.println("\t***'바위' 승률이 1등 !***");
                        System.out.println("***다음에는 [바위]를 더 내어 보세요 ^_^ㅇ***");
                        System.out.println("=====================================================");
                    } else if (winP > (winS + winR)) {
                        System.out.println("\t***보자기 승률이 1등 !***");
                        System.out.println("***다음에는 [보자기]를 더 내어 보세요 ^_^P***");
                        System.out.println("=====================================================");
                    }
                } else if (sel == 0) {
                    sc.nextLine();
                    System.out.println("\t정말로 종료해요 ? ㅠㅠ y / n");
                    yn = sc.nextLine().trim().toLowerCase();
                    if(yn.equals("y")) {
                        System.out.println("\t구럼 시스템 종료할게요! 다음에 또 봐요 ! ");
                        System.exit(0);
                    }
                    if(yn.equals("n")){
                        System.out.println("\t헷 다행이당 ! 더 놀아요 !");
                        break;
                    }
                }
            }
        }//while
    }
}
