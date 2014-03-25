/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/93/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(" ");
        for (var i = 0; i < arr.length; i++)
            process.stdout.write(arr[i].charAt(0).toUpperCase() + arr[i].substring(1) + " ");
        console.log();
    }
});