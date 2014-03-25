/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/18/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(","); // Splits the string by space
        var x = arr[0];
        var y = arr[1];
        var total = 0;
        for (var counter = 0; total < x; counter++) {
            total = y * counter;
        }
        console.log(total);
    }
});