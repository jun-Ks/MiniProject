package MiniProject;

public interface IGameService {
    public void regMember(MemberVO member);
    public boolean login(String id, String password);
    public boolean checkId(String id);
    public void playGame();
}
