package PRG611S.LABS;

public class Practice {
    private String practice;
    Practice(){
        practice = "Take 1";
    }
    public static void main(String[] args) {
        Practice take = new Practice();
        String takes = take.practice;

        System.out.println(takes);
    }
}


