/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/97/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split("| "); // Splits the string by space
        var nums = arr[1].split(" ");
        for (var i = 0; i < nums.length; i++) {
            var n = parseInt(nums[i]);
            var c = (arr[0][n - 1]).toString();
            process.stdout.write(c.toString());
        }
        console.log();
    }
});