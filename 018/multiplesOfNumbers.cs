/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/18/
*/

using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

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
                    String[] nums = line.Split(',');
                    int x = Convert.ToInt16(nums[0]);
                    int n = Convert.ToInt16(nums[1]);
                    int total = 0;
                    for (int counter = 0; total < x; counter++) total = n * counter;
                    Console.WriteLine(total);
                }
                catch (Exception exc)
                {
                    Console.WriteLine("error occured: " + exc);
                }
            }
    }
}
