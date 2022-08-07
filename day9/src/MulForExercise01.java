import java.util.Scanner;

//统计3个班的成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分,以及三个班级及格的人数
public class MulForExercise01 {
    public static void main(String[] args) {
        //思路：先化繁为简 先计算一个班
        //然后多重循环三个班，接着算平均分
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;//累计所有人的成绩
        int passNum = 0;//累积及格的人数

        for (int i = 1; i <= 3; i++) {//i表示班级
            double sum = 0;//一个班级的总分
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入" + i + "个班的第" + j + "个的学生成绩");
                double score = scanner.nextDouble();
                if (score >= 60){
                    passNum++;
                }
                sum += score;
                System.out.println("成绩为" + score);
            }
            System.out.println("sum+"+ sum + "平均分=" + (sum / 5));

        }
        System.out.println("3个班总分=" + totalScore + "平均分=" + totalScore / 15);
        System.out.println("及格人数为" + passNum);
    }
    }

