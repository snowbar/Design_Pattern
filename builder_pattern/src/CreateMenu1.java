public final class CreateMenu1 implements MenuDirector {
    private MenuBuilder builder;
    public CreateMenu1(MenuBuilder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.shopTitle("ファミレスMenu");
        builder.addBreakfast("ご飯",100);
        builder.addBreakfast("干物定食",400);
        builder.addBreakfast("モーニングセット",350);
        builder.addLunch("牛丼",300);
        builder.addLunch("カレー",250);
        builder.addLunch("焼肉定食",500);
        builder.addDinner("鍋",800);
        builder.addDinner("すき焼き御膳",1000);
        builder.addDrink("お茶",100);
        builder.addDrink("オレンジジュース",100);
        builder.addDrink("お酒各種",200);
        builder.close();
    }
}
