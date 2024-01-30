package edu.bu.ass1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. 作业要求的screenshots or recording直接是程序运行的结果吗？
 * 2. video指的是什么？
 * 3. <a href="https://github.com/nioliu/cs673ass/tree/main/ass/src/main/java/ass1">...</a>
 */
public class CombineElements {
    public static void main(String[] args) {
        combine();
    }

    public static void combine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two lists like: [a,b,c],[1,2,3]");
        try {
            String cmd = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\[([^]]*)]\\s*,\\s*\\[([^]]*)]");
            Matcher matcher = pattern.matcher(cmd);

            if (!matcher.find()) {
                throw new Exception("not two standard list");
            }
            String s1 = matcher.group(1);
            String s2 = matcher.group(2);
            String[] arr1 = s1.split(",");
            String[] arr2 = s2.split(",");

            if (arr1.length != arr2.length) {
                throw new Exception("length not equal in these two lists");
            }

            StringBuilder res = new StringBuilder();
            res.append("[");
            for (int i = 0; i < arr1.length; i++) { // 修改循环条件
                res.append(arr1[i]).append(",").append(arr2[i]);
                if (i != arr1.length - 1) {
                    res.append(",");
                }
            }
            res.append("]");
            System.out.println(res);
        } catch (Exception e) {
            System.out.printf("Unexpected input: %s! Exit.\n", e.getMessage());
        }
    }
}
