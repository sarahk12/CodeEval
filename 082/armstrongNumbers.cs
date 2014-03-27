/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/82/
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
                    int length = line.Length;
                    int num = 0;
                    if (null == line)
                        continue;
                    try
                    {
                        num = Convert.ToInt32(line);
                        
                        Console.WriteLine(armstrong(num, length));
                        
                    }
                    catch (Exception exc)
                    {
                        Console.WriteLine("error occured: " + exc);
                    }
                }
        }
        public static bool armstrong(int num, int length)
        {
            int total = 0;
            int temp = num;
            for (int i = 0; i < length; i++)
            {
                total = total + Convert.ToInt32(Math.Pow((num % 10), length));
                num = num / 10;
            }
            if (temp == total)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
