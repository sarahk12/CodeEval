/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/30/
*/

using System;
using System.IO;
using System.Collections;

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
                    String[] twoLists = line.Split(';');
                    String[] list1 = twoLists[0].Split(',');
                    String[] list2 = twoLists[1].Split(',');
                    ArrayList list = new ArrayList();
                    for (int i = 0; i < list1.Length; i++)
                    {
                        for (int j = 0; j < list2.Length; j++)
                        {
                            if (list1[i].CompareTo(list2[j]) == 0) list.Add(list1[i]);
                        }
                    }
                    if (list.Count > 0) Console.Write(list[0]);
                    for (int i = 1; i < list.Count; i++) Console.Write("," + list[i]);
                    Console.WriteLine();
                }
                catch (Exception exc)
                {
                    Console.WriteLine("error occured: " + exc);
                }
            }
    }
}
