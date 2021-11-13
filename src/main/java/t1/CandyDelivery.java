package t1;

import java.util.Scanner;

/**
 * Project name(项目名称)：练习_数组处理
 * Package(包名): t1
 * Class(类名): CandyDelivery
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 12:23
 * Version(版本): 1.0
 * Description(描述)：
 * 用candyArray数组保存从命令行输入的10个int型数据。
 * 计算糖果数量的总和，用变量sumCandies存储糖果的总数。
 * 循环输出每个小朋友需要的糖果数量，即遍历candyArray数组输出每个元素（注意：每个元素之间用空格分隔，但结尾不要有空格）。
 * 评测说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * 以下是测试样例：
 * <p>
 * 测试输入：
 * 1 2 3 4 5 6 7 8 9 10
 * 预期输出：
 * 1 2 3 4 5 6 7 8 9 10[无空格]
 * 55
 */

public class CandyDelivery
{

    public static void main(String[] args)
    {
        int sumCandies = 0;
        int[] candyArray = new int[10];
        Scanner scanner = new Scanner(System.in); //用于读入测试数据

        /********** Begin *********/
        for (int i = 0; i < 10; i++)
        {
            int numCandy = scanner.nextInt(); //用于读取下一个数据，即每个小朋友想要的糖果
            // 请在此处补全循环代码
            candyArray[i] = numCandy;
            sumCandies += numCandy;
        }

        // 请在此处添加遍历数组相关代码
        for (int i = 0; i < candyArray.length - 1; i++)
        {
            System.out.print(candyArray[i] + " ");
        }
        System.out.print(candyArray[candyArray.length - 1]);

        /********** End *********/

        System.out.println();
        System.out.print(sumCandies);
    }

}
