/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/3/
*/

using System;

namespace sarahTesting
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, j, value, num = 0, ii = 0;
	        char[] first = new char[3];
            char[] second = new char[3];
            for (i = 999; i > 1; i--) {
		        if (i % 2 == 0)
			        continue;
		        for (j = 3; j < i/2; j+=2) {
			        if (i % j == 0)
				        break;
			        else if (j == (i/2) - 1) {
				        ii = i;
				        while (ii != 0) {
					        num = num * 10;
					        num = num + (ii % 10);
					        ii = ii / 10;
				        }
				        if (num == i) {
                            Console.WriteLine(i);
					        return;
				        }
				        num = 0;
			        }
		        }
	        }
            return;
        }
    }
}
