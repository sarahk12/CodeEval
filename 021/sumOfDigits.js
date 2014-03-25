/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/21/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        var total = 0;
        var num = parseInt(line);
        while (num > 0) {
            total = total + (num % 10);
            num = Math.floor(num / 10);
        }
        console.log(total);
    }
});