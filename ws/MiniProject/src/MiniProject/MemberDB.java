package MiniProject;


import java.util.ArrayList;

public class MemberDB {
    ArrayList<MemberVO> list = new ArrayList<>();
    public boolean login(String id, String password){
        for(MemberVO x : list){
            if(x.getId().equals(id) && x.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public void insert(MemberVO member){
        list.add(member);
    }

    public boolean checkId(String id){
        for(MemberVO x : list){
            if(x.getId().equals(id)){
                return true;
            }
        }
        return false;
    }


}
