/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/8/
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
                    string[] words = line.Split(' ');
                    for (int i = words.Length -1; i > -1; i--) Console.Write(words[i] + " ");
                    Console.WriteLine();
                }
                catch (Exception exc)
                {
                    Console.WriteLine("error occured: " + exc);
                }
            }
    }
}
