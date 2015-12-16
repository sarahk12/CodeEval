/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/147/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var lower = /[a-z]/g;
        var result = line.match(lower);
        var lowlen = 0;
		if (result === null) {
			lowlen = 0;
		} else {
			lowlen = result.length;
		}
        console.log("lowercase: " + ((lowlen/line.length) * 100).toFixed(2) +" uppercase: " + (((line.length - lowlen)/line.length) * 100).toFixed(2));
    }
});
