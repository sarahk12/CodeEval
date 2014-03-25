/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/40/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        var listNum = new Array();
        for (var i = 0; i < line.length; i++)
            listNum[i] = 0;
        for (var i = 0; i < line.length; i++) {
            var num = parseInt(line.charAt(i));
            listNum[num]++;
        }
        var anotherLine = listNum.join("");

        var a = parseInt(line);
        var b = parseInt(anotherLine);

        if (a === b)
            console.log(1);
        else
            console.log(0);
    }
});