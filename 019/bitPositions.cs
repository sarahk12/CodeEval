/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/19/
*/

using System;
using System.IO;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        using (StreamReader reader = File.OpenText(args[0]))
            while (!reader.EndOfStream)
            {
                string line = reader.ReadLine();
                int first = 0;
                if (null == line)
                    continue;
                try
                {
                    string[] nums = line.Split(',');
                    int num = Convert.ToInt32(nums[0]);
                    int loc1 = Convert.ToInt16(nums[1]);
                    int loc2 = Convert.ToInt16(nums[2]);
                    int[] bin = new int[400];
                    int i = 0;
                    for (i = 0; num > 2; i++)
                    {
                        bin[i] = num % 2;
                        num = num / 2;
                    }
                    if (num == 1)
                        bin[i++] = 1;
                    else
                        bin[i++] = 0;
                    int bit1 = Convert.ToInt16(bin[loc1 - 1]);
                    int bit2 = Convert.ToInt16(bin[loc2 - 1]);
                    if (bit1 == bit2) Console.WriteLine("true");
                    else Console.WriteLine("false");
                    first = 1;
                }
                catch (Exception exc)
                {
                    Console.WriteLine("error occured: " + exc);
                }
            }
    }
}
