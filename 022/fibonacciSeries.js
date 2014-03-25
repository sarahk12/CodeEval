/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/22/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var n = parseInt(line);
        var sum = parseInt(fibSeries(n));
        console.log(sum);
    }
});

function fibSeries(n) {
    var sum = 0;
    if (n === 0)
        return 0;
    else if (n === 1)
        return 1;
    n = parseInt(n - 1);
    sum = parseInt(parseInt(sum) + parseInt(fibSeries(n)) + parseInt(fibSeries(n - 1)));
    return parseInt(sum);
}