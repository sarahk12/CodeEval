/*
	@author Sarah Kidd (www.linkedin.com/in/sarahkidd/)
	Description of problem at: https://www.codeeval.com/open_challenges/13/
*/

var fs = require("fs");
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== "") {
        line = line.replace(/\r/gm, ""); // For Windows.
        var arr = line.split(", "); // Splits the string by space
        var letters = arr[1].split("");
        var word = arr[0];
        for (var i = 0; i < letters.length; i++) {
            var c = letters[i].toString();
            word = word.split(c);
            word = word.toString();
        }
        word = word.replace(/,/g, "");
        console.log(word);
    }
});