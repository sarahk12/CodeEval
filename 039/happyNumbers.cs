/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/39/
*/

using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sarahTesting
{
    class Program
    {
        static void Main(string[] args)
        {
            using (StreamReader reader = File.OpenText(args[0]))
                while (!reader.EndOfStream)
                {
                    string line = reader.ReadLine();
                    if (null == line)
                        continue;
                    int num = 0;
                    try
                    {
                        num = Convert.ToInt32(line);
                        num = happyNums(num);
                    }
                    catch (Exception exc)
                    {
                        Console.WriteLine("error occured: " + exc);
                    }
                    Console.WriteLine(num);
                }
        }
        public static int happyNums(int num)
        {
            for (int i = 0; i < 100; i++)
            {
                int total = 0;
                while (num > 0)
                {
                    total = Convert.ToInt32(Math.Pow((num % 10), 2)) + total;
                    num = Convert.ToInt32(num / 10);
                }
                if (total == 1)
                {
                    return 1;
                } 
                num = total;
            }
            return 0;
        }
    }
}
