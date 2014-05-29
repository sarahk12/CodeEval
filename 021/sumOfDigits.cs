/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/21/
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
                if (null == line)
                    continue;
                try
                {
                    char[] strNums = line.ToCharArray();
                    int total = 0;
                    for (int i = 0; i < line.Length; i++) total = total + Int16.Parse(strNums[i].ToString());
                    Console.WriteLine(total);
                }
                catch (Exception exc)
                {
                    Console.WriteLine("error occured: " + exc);
                }
            }
    }
}
