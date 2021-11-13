package t3;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Project name(项目名称)：练习_数组处理
 * Package(包名): t3
 * Class(类名): RecordRecovery
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 12:35
 * Version(版本): 1.0
 * Description(描述)：
 * 用record数组保存从命令行输入的10个int型数据。
 * 用recordRecovery数组保存去除重复数据后的元素。示例：数组1 1 2 2 3 3中删去重复的数字，即转变为1 2 3
 * 按照数字大小顺序，循环输出recordRecovery数组。
 * 测试说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * <p>
 * 以下是测试样例：
 * <p>
 * 测试输入：
 * 1 2 2 3 9 9 5 5 8 8
 * 预期输出：
 * 1 2 3 5 8 9
 */

public class RecordRecovery
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] record = new int[10];
        int[] tempRecovery = new int[10];
        int[] recordRecovery = new int[10];
        int num = 0;
        /********** Begin *********/
        for (int i = 0; i < 10; i++)
        {
            int s;
            //控制台输入变量:s
            int errCount = 0;
            while (true)
            {
                try
                {
                    //min:-100000
                    //max:1000000
                    System.out.print("请输入第"+(i+1)+"个数字：");
                    s = input.nextInt();
                    if (s >= -100000 && s <= 1000000)
                    {
                        break;
                    }
                    else
                    {
                        errCount++;
                        Toolkit.getDefaultToolkit().beep();
                        if (errCount > 10)
                        {
                            System.err.println("错误次数过多！！！退出");
                            System.exit(1);
                        }
                        System.out.println("输入的数据不在范围内! 范围：[-100000,1000000]");
                    }
                }
                catch (Exception e)
                {
                    errCount++;
                    if (errCount > 5)
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.err.println("错误次数过多！！！退出");
                        System.exit(1);
                    }
                    else
                    {
                        Toolkit.getDefaultToolkit().beep();
                        System.out.println("输入错误！！！请重新输入！");
                        input.nextLine();
                    }
                }
            }
            record[i] = s;
        }
        Arrays.sort(record);
        for (int i = 0; i < 10; i++)
        {
            boolean isTrue = true;
            for (int j = i + 1; j < 10; j++)
            {
                if (record[i] == record[j])
                {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue)
            {
                tempRecovery[num] = record[i];
                num++;
            }
        }
        System.arraycopy(tempRecovery, 0, recordRecovery, 0, num);
        /********** End *********/
        for (int i = 0; i < num; i++)
        {
            System.out.print(recordRecovery[i]);
            if (i != num - 1)
            {
                System.out.print(' ');
            }
        }
    }
}
