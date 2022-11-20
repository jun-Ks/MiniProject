package MiniProject;

import java.util.Scanner;

public class MainFunc {
    Scanner sc = new Scanner(System.in);
    GameService gs = new GameService();
    int sel;
    boolean tf;
    String id, password, name, yn;

    public void showMenu(){
        System.out.println("===================가위 바위 보========================");
        System.out.println("\t\t\t>> 메뉴를 선택해주세요 ! <<");
        System.out.println("\t\t1. 로그인 하기 2. 회원가입하기 0.나가기");
        System.out.println("=====================================================");
    }
    public void loginMenu(){
        System.out.println("\t 좋아 ! 로그인 합시다요 !");
        while(true){
            System.out.print("\t아이디를 입력해주세요. /나가기는 q > ");
            id = sc.nextLine();
            if(id.equals("q"))
                break;
            System.out.print("\t비밀번호 입력해주세요. > ");
            password = sc.nextLine();
            tf = gs.login(id, password);
            if(tf){
                System.out.println("=====================================================");
                System.out.println("\t***" + id+ "님 환영합니당 ! 로그인 되었습니다. ***");
                System.out.println();
                System.out.print("\t바로 게임을 시작하시겠습니까 ? y / n > ");
                yn = sc.nextLine().trim().toLowerCase();
                if(yn.equals("n")){
                    break;
                }
                if(yn.equals("y")){
                    gs.playGame();
                }
                break;
            }
            else{
                System.out.println("\t아이디나 비밀번호를 다시 확인해주세요 ! ");
            }
        }
    }
    public void regMemMenu(){
        System.out.println("\t 어서오세요 ! 얼른 회원가입합시다 ! ");
        System.out.print("\t이름 입력해주세요. /나가기는 q > ");
        name = sc.nextLine();
        while(true) {
            System.out.print("\t아이디 입력해주세요. > ");
            id = sc.nextLine().toLowerCase().trim();
            tf = gs.checkId(id);
            if (tf) {
                System.out.println("\t중복된 아이디 입니다ㅠㅠ! 다시 입력해주세요.");
            }else
                break;
        }
        while(true){
            System.out.print("\t비밀번호 입력해주세요. > ");
            password = sc.nextLine();
            if (!(id.equals(password))) {
                break;
            } else {
                System.out.println("아이디와 비밀번호가 같습니다 ! 보안을 위해 다르게 설정해주세요 !");
            }
        }
        System.out.println("=====================================================");
        System.out.println("\t축하합니다 ! "+ "***" + name + "님*** 회원가입이 완료되었습니다 ! ");
        System.out.println("\t게임을 하시려면 로그인 해주세요 !!!!");
        System.out.println("=====================================================");
        MemberVO m = new MemberVO(id, password, name);
        gs.regMember(m);
    }
    public void exitMenu(){
        sc.nextLine();
        System.out.println("\t정말로 종료해요 ? ㅠㅠ y / n");
        yn = sc.nextLine().trim().toLowerCase();
        if(yn.equals("y")) {
            System.out.println("\t구럼 시스템 종료할게요! 다음에 또 봐요 ! ");
            System.exit(0);
        }
        if(yn.equals("n")){
            System.out.println("\t헷 다행이당 ! 더 놀아요 !");
        }
    }
}
