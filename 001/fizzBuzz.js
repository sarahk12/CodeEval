/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/1/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(" "); // Splits the string by space
        var fizz = arr[0];
        var buzz = arr[1];
        var end = arr[2];

        for (var start = 1; start <= end; start++) {
            if (start % fizz === 0 && start % buzz === 0) {
                process.stdout.write("FB ");
            }
            else if (start % fizz === 0) {
                process.stdout.write("F ");
            }
            else if (start % buzz === 0) {
                process.stdout.write("B ");
            }
            else {
                process.stdout.write(start + " ");
            }
        }
        console.log();
    }
});