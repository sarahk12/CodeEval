/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/111/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(" ");
        var longest = 0;
        var length = 0;
        for (var i = 0; i < arr.length; i++) {
            if (arr[i].length > length) {
                length = arr[i].length;
                longest = i;
            }
        }
        console.log(arr[longest]);
    }
});