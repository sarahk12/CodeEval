/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/96/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        for (var i = 0; i < line.length; i++) {
            var c = line.charCodeAt(i);
            if (c > 64 && c < 91)
                process.stdout.write(line[i].toLowerCase());
            else if (c > 96 && c < 123)
                process.stdout.write(line[i].toUpperCase());
            else
                process.stdout.write(line[i].toString());
        }
        console.log();
    }
});