package MiniProject;

public class GameService implements IGameService{
    MemberDB db = new MemberDB();
    GameDB game = new GameDB();
    @Override
    public void regMember(MemberVO member) {
        db.insert(member);
    }

    @Override
    public boolean login(String id, String password) {
        return db.login(id, password);
    }

    @Override
    public boolean checkId(String id) {

        return db.checkId(id);
    }

    @Override
    public void playGame() {
        game.playGame();
    }
}
