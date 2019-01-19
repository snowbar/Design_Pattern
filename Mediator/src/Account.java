import java.util.HashMap;

public final class Account {
    private HashMap<String, String> hashmap;
    public void construct() {
        hashmap = new HashMap<String, String>();
        hashmap.put("first","one");
        hashmap.put("second","two");
        hashmap.put("third","three");
    }
    public void check(String user,String pass) {
        String passCheck = hashmap.get(user);
        if (passCheck == null) {
            System.out.println("アカウントが存在しません。");
        } else if(passCheck.equals(pass)){
            System.out.println("こんにちは、" + user + "さん！");
            System.exit(0);
        } else {
            System.out.println("パスワードが違います。");
        }
    }
}
