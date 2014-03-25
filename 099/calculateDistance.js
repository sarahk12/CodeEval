/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/99/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var res1 = line.replace(/[(*)*,*]/g, "");
        var arr = res1.split(" ");
        var x1 = parseInt(arr[0]);
        var y1 = parseInt(arr[1]);
        var x2 = parseInt(arr[2]);
        var y2 = parseInt(arr[3]);
        var distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        console.log(distance.toString());
    }
});