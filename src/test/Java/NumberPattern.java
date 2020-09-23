import java.util.Scanner;

/**
 * @author 冯怿
 * @since 2019/12/17 20:03
 */
public class NumberPattern {
    public static void numberPatternPrint(int n){
        int num = 0;
        for (int i=0;i<n;i++){
            StringBuilder stringBuilder = new StringBuilder("");
            if (i%2==1){
                for (int j=i+1;j>=1;j--){
                    stringBuilder.append(String.valueOf(num+j));
                    if (j!=1){
                        stringBuilder.append("*");
                    }
                }
            }else {
                for (int j=1;j<=i+1;j++){
                    stringBuilder.append(String.valueOf(num+j));
                    if (j!=i+1){
                        stringBuilder.append("*");
                    }
                }
            }
            System.out.println(stringBuilder.toString());
            num = num+i+1;
        }
    }
}
