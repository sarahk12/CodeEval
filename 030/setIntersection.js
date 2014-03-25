/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/30/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(";"); // Splits the string by space
        var list1 = arr[0].split(",");
        var list2 = arr[1].split(",");
        var comma = false;
        for (var i = 0; i < list1.length; i++) {
            for (var j = 0; j < list2.length; j++) {
                if (list1[i] === list2[j] && comma === false) {
                    process.stdout.write(list2[j]);
                    comma = true;
                }
                else if (list1[i] === list2[j] && comma === true)
                    process.stdout.write("," + list2[j]);
            }
        }
        console.log();
    }
});