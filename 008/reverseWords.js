/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/8/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(" ");
        for (var i = (arr.length - 1); i > -1; i--) {
            process.stdout.write(arr[i] + " ");
        }
        console.log();
    }
});