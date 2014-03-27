/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/1/
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
                    string[] arr = line.Split(' ');
                    int fizz = Convert.ToInt32(arr[0]);
                    int buzz = Convert.ToInt32(arr[1]);
                    int end = Convert.ToInt32(arr[2]);

                    for (int start = 1; start <= end; start++)
                    {
                        if (start % fizz == 0 && start % buzz == 0)
                            Console.Write("FB ");
                        else if (start % fizz == 0)
                            Console.Write("F ");
                        else if (start % buzz == 0)
                            Console.Write("B ");
                        else
                            Console.Write(start + " ");
                    }
                    Console.WriteLine();
                }
        }
    }
}
