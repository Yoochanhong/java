public class SwitchCase2 {
    public static void main(String[] args) {
        String medal = "Gold";

        switch(medal){
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Sliver":
                System.out.println("은메달입니다.");
                break;
            case "Bronze":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
                break;
        }
    }
}

//java 7부터는 switch case문에 문자열도 사용할수 있게 바뀌었다. 너무 편하다.