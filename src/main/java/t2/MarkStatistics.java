package t2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project name(项目名称)：练习_数组处理
 * Package(包名): t2
 * Class(类名): MarkStatistics
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 12:28
 * Version(版本): 1.0
 * Description(描述)：
 * 用class1Grade数组保存第一组数据，用class2Grade保存第二组数据，每一组均是5个int型数据。
 * 用gradeCount数组保存合并后的数组，并将该数组元素按照从小到大的顺序输出。
 * 评测说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * <p>
 * 以下是测试样例：
 * <p>
 * 测试输入：
 * 1 3 5 7 9
 * 0 2 4 6 8
 * 预期输出：
 * 0 1 2 3 4 5 6 7 8 9
 */

public class MarkStatistics
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] class1Grade = new int[5];
        int[] class2Grade = new int[5];
        int[] gradeCount = new int[class1Grade.length + class2Grade.length];
        /********** Begin *********/
        for (int i = 0; i < 5; i++)
        {
            class1Grade[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++)
        {
            class2Grade[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++)
        {
            if (i < 5)
            {
                gradeCount[i] = class1Grade[i];
            }
            else
            {
                gradeCount[i] = class2Grade[i - 5];
            }
        }

        Arrays.sort(gradeCount);
        /********** End *********/
        for (int i = 0; i < gradeCount.length; i++)
        {
            System.out.print(gradeCount[i]);
            if (i != gradeCount.length - 1)
            {
                System.out.print(' ');
            }
        }
    }
}
