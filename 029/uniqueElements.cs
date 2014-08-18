/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/29/
*/

using System;
using System.IO;
using System.Collections.Generic;
using System.Text;
using System.Linq;

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
                    String[] strArr = line.Split(',');
                    List<String> list = strArr.ToList();
                    list = list.Distinct().ToList();
                    int first = 0;
                    foreach (String s in list)
                    {
                        if (first == 0)
                        {
                            Console.Write(s);
                            first = 1;
                        }
                        else Console.Write("," + s);
                    }
                    Console.WriteLine();
                }
                catch (Exception exc)
                {
                    Console.WriteLine("error occured: " + exc);
                }
            }
    }
}
