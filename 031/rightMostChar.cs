/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/31/
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
                if (null == line) continue;
                try
                {
                    String[] parts = line.Split(',');
                    char[] part1 = parts[0].ToCharArray();
                    char c = Convert.ToChar(parts[1]);
                    int loc = -1;
                    for (int i = part1.Length - 1; i > -1; i--)
                    {
                        if (("" + part1[i]).CompareTo("" + c) == 0)
                        {
                            loc = i;
                            break;
                        }
                    }
                    Console.WriteLine(loc);
                }
                catch (Exception exc)
                {
                    Console.WriteLine("error occured: " + exc);
                }
            }
    }
}
