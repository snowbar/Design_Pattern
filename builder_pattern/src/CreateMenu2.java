public class CreateMenu2 implements MenuDirector {
    private MenuBuilder builder;
    public CreateMenu2(MenuBuilder builder) {
        this.builder = builder;
    }
    public void construct() {
        //順番によるバグがないかのテスト
        builder.addDinner("hoge",80);
        builder.addDrink("fuga",100);
        builder.addBreakfast("piyo",20);
        builder.addLunch("foo",30);
        builder.shopTitle("bar");
        builder.close();
        
    }
}
