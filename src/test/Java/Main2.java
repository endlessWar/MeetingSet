import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static boolean CheckBlackList(String userIP, String blackIP) {
        try {
            boolean retrun = true;
            String[] s1 = userIP.split("\\.");
            String[] s2 = blackIP.split("\\.");
            for (int i =0;i<4;i++){
                if (!s1[i].equals(s2[i])){
                    if (s2[3].contains("/")){
                        String[] less = s2[3].split("/");
                        if (s1[3].equals(less[0])){
                            return true;
                        }else {

                            StringBuilder userIpBuilder = new StringBuilder("");
                            StringBuilder userIpBuilder2 = new StringBuilder("");
                            StringBuilder blackIPBuilder = new StringBuilder("");
                            StringBuilder blackIPBuilder2 = new StringBuilder("");
                            for (int j=0;j<4;j++){
                                String suser = Integer.toBinaryString(Integer.parseInt(s1[j]));
                                String sblack;
                                if (j!=3){
                                    sblack = Integer.toBinaryString(Integer.parseInt(s2[j]));
                                }else {
                                    sblack = Integer.toBinaryString(Integer.parseInt(less[0]));
                                }
                                userIpBuilder.append(suser);
                                blackIPBuilder.append(sblack);
                            }
                            for (int j=0;j<24;j++){
                                if (j<Integer.parseInt(less[1])){
                                    userIpBuilder2.append('1'&userIpBuilder.toString().indexOf(j));
                                    blackIPBuilder2.append('1'&blackIPBuilder.toString().indexOf(j));
                                }else {
                                    userIpBuilder2.append('0'&userIpBuilder.toString().indexOf(j));
                                    blackIPBuilder2.append('0'&blackIPBuilder.toString().indexOf(j));
                                }
                            }
                            return userIpBuilder2.toString().equals(blackIPBuilder2.toString());
                        }
                    }else {
                        return false;
                    }
                }
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    /******************************结束写代码******************************/



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;

        String _userIP;
        try {
            _userIP = in.nextLine();
        } catch (Exception e) {
            _userIP = null;
        }

        String _blackIP;
        try {
            _blackIP = in.nextLine();
        } catch (Exception e) {
            _blackIP = null;
        }

        res = CheckBlackList(_userIP, _blackIP);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}
