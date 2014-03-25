/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/10/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(" "); // Splits the string by space
        var loc = arr[arr.length - 1];
        if (loc >= arr.length) { }
        else
            console.log(arr[arr.length - loc - 1]);
    }
});