/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/91/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        var arr = line.split(" ");
        for (var i = 0; i < arr.length; i++) {
            for (var j = 0; j < arr.length - 1; j++) {
                if (parseFloat(arr[j]) > parseFloat(arr[j + 1])) {
                    var temp = parseFloat(arr[j + 1]);
                    arr[j + 1] = parseFloat(arr[j]);
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++)
            process.stdout.write(arr[i].toFixed(3) + " ");
        console.log();
    }
});