package MiniProject;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainFunc mf = new MainFunc();
        int sel;
        while(true){
            mf.showMenu();
            sel = sc.nextInt();
            switch (sel){
                case 1: //로그인 //로그인 성공시 게임시작
                    mf.loginMenu();
                    break;
                case 2: //회원가입메뉴
                    mf.regMemMenu();
                    break;
                case 0: //끝내기
                   mf.exitMenu();
                   break;
            }//case
        }//while
    }
}
