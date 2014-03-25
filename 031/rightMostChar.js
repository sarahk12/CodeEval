/*
    @author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
    Description of problem at: https://www.codeeval.com/open_challenges/31/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(",");
        var c = arr[1];
        var pos = 0;
        for (var i = 0; i < arr[0].length; i++) {
            var quest = arr[0].charAt(i);
            if (quest === c)
                pos = i;
        }
        if (pos === 0)
            console.log("-1");
        else
            console.log(pos);
    }
});