/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/###/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(';');
		console.log(arr);
		//process.stdout.write();
    }
});
