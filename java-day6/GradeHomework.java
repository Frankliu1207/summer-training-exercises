public class GradeHomework {
    public static void main(String[] args){
        System.out.println("59 -> " + grade(59));
        System.out.println("60 -> " + grade(60));
        System.out.println("89 -> " + grade(89));
        System.out.println("100 -> " + grade(100));
        System.out.println("69 -> " + grade(69));
        System.out.println("70 -> " + grade(70));
        System.out.println("79 -> " + grade(79));
        System.out.println("80 -> " + grade(80));
        System.out.println("90 -> " + grade(90));

        try {
            System.out.println("-1 -> " + grade(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("-1 -> 异常：" + e.getMessage());
        }

        try {
            System.out.println("101 -> " + grade(101));
        } catch (IllegalArgumentException e) {
            System.out.println("101 -> 异常：" + e.getMessage());
        }
    }

    public static String grade(int score){
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("分数必须在0到100之间");
        }
        if(score >= 90){
            return "A";
        }else if(score >= 80){
            return "B";
        }else if(score >= 70){
            return "C";
        }else if(score >= 60){
            return "D";
        }else{
            return "F";
        }
    }
}
