class Baby {
    private String name;

    //Babyの振る舞いを記述
    public Baby(String name) {
        this.name = name;
    }

    public void laugh(){
        System.out.println("笑っている");
    }

    public void cry(){
        System.out.println("泣いている");
    }

    public void sleep(){
        System.out.println("眠っている");
    }

    //ゲッターとセッターを記述
    public String getName () {
        return name;
    }

}

public class Main {
    public static void main(String[] args) {
        Baby babe = new Baby("Hanako");
        System.out.println(babe.getName()+"ちゃんの一日");

        int rand;

        //乱数でbabeの振る舞いを決定
        for(int i=0;i<5;i++){
            rand = new java.util.Random().nextInt(3)+1;
            if (rand == 1){
                babe.laugh();
            }else if(rand==2){
                babe.cry();
            }else{
                babe.sleep();
            }
        }
    }
}
