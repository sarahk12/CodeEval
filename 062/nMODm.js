/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/62/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        var arr = line.split(",");
        var n = parseInt(arr[0]);
        var m = parseInt(arr[1]);
        var divNum = Math.floor(n / m);
        var remainder = n - (divNum * m);
        console.log(remainder);
    }
});